package com.petnolja.semi.admin.post.model.service;

import com.petnolja.semi.admin.common.dto.AdminPictureDTO;
import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class AdminPostService {
	private AdminPostDAO adminPostDAO; 
	
	public int insertPetsitterPost(PetsitterPostDTO petsitterPost) {
		int result = 0;
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		int postResult = adminPostDAO.insertPetsitterPost(petsitterPost);
		
		if(petsitterPost.getAdminPicture().getAdminPictureSaveRoute() != null) {
			AdminPictureDTO adminPicture = petsitterPost.getAdminPicture();
			int pictureResult = adminPostDAO.insertAdminPicture(adminPicture);
			if(pictureResult > 0) {
				result = 1;
			}
		}
		
		if(postResult > 0) {
			result = 1;
		}
		
		if(result == 0) {
			sqlSession.rollback();
		} else {
			sqlSession.commit();
		}
		sqlSession.close();
		
		return result;
	}

	public PetsitterPostDTO selectPetsitterPost(int petsitterPostNo) {
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		PetsitterPostDTO petsitterPost = adminPostDAO.selectPetsitterPost(petsitterPostNo);
		
		sqlSession.close();
		
		return petsitterPost;
	}

	public int updatePetsitterPost(PetsitterPostDTO petsitterPost) {
		int result = 0;
		
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		int postResult = adminPostDAO.updatetPetsitterPost(petsitterPost);
		System.out.println("boardResult : " + petsitterPost);
		
		if(petsitterPost.getAdminPicture().getAdminPictureName() != null) {
			AdminPictureDTO adminPicture = petsitterPost.getAdminPicture();
			
			int adminPictureResult = adminPostDAO.updateAdminPicture(adminPicture);
			
			if(adminPictureResult < 1) {
				sqlSession.rollback();
			}
			
		}
		
		/* 모든 결과가 성공이면 트랜젝션을 완료한다. */
		if(postResult > 0 ) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

	public int deletePetsitterPost(int petsitterPostNo) {
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		int result = 0;
		int deletePic = adminPostDAO.deletePetsitterPicture(petsitterPostNo);
		int deletepost = adminPostDAO.deletePetsitterPost(petsitterPostNo);
		
		if(deletePic > 0 && deletepost > 0) {
			sqlSession.commit();
			result = 1;
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

}
