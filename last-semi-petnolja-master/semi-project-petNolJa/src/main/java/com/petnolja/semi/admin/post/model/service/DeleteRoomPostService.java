package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class DeleteRoomPostService {
	private AdminPostDAO mapper;
	public int deleteRoomPost(String roomPostNo) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		int result = 0;
		System.out.println("나오냐?1");
		int PicResult = mapper.deleteRoomPicture(roomPostNo);
		System.out.println("나오냐?2");
		int PostResult = mapper.deleteRoomPost(roomPostNo);
		System.out.println("나오냐?3");
		System.out.println("PicResult: " + PicResult);
		System.out.println("PostResult : " + PostResult );
		if(PicResult > 0 && PostResult > 0) {
			sqlSession.commit();
			result = 1;
		}else {
			sqlSession.rollback();
		}
		
		return result;
	}

}
