package com.petnolja.semi.member.post.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.common.paging.SelectCriteria;
import com.petnolja.semi.member.post.model.dao.MemberPostDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class MemberPostService {
	private MemberPostDAO memberPostDAO;
	
	public int selectTotalCount(Map<String, String> searchMap) {
		SqlSession sqlSession = getSqlSession();
		memberPostDAO = sqlSession.getMapper(MemberPostDAO.class);
		
		int totalCount = memberPostDAO.selectTotalCount(searchMap);
		
		sqlSession.close();
		
		return totalCount;
	}

	public List<PetsitterPostDTO> selectPetsitterPostList(SelectCriteria selectCriteria) {
		SqlSession sqlSession = getSqlSession();
		memberPostDAO = sqlSession.getMapper(MemberPostDAO.class);
		List<PetsitterPostDTO> petsitterPostList = memberPostDAO.selectPetsitterPostList(selectCriteria);
		System.out.println(petsitterPostList);
		sqlSession.close();

		return petsitterPostList;
	}

	public PetsitterPostDTO selectPetsitterPostDetail(int petsitterPostNo) {
		SqlSession sqlSession = getSqlSession();
		memberPostDAO = sqlSession.getMapper(MemberPostDAO.class);
		
		int result = memberPostDAO.increamentPetsitterPostCount(petsitterPostNo);
		PetsitterPostDTO petsitterPostDetail = null;
		
		if(result > 0) {
			petsitterPostDetail = memberPostDAO.selectPetsitterPostDetail(petsitterPostNo);
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return petsitterPostDetail;
	}



}
