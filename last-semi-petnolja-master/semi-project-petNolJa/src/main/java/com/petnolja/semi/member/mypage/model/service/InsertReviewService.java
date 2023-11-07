package com.petnolja.semi.member.mypage.model.service;

import com.petnolja.semi.member.mypage.model.dao.MyPageDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class InsertReviewService {

	MyPageDAO mapper;

	public int insertReview(Map<String, String> insertReviewMap) {
	SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MyPageDAO.class);
		
		int result = mapper.insertReview(insertReviewMap); 
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}
}
