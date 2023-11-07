package com.petnolja.semi.member.review.model.service;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;

import org.apache.catalina.connector.Response;
import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.review.model.dao.ReviewDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
public class UpdateReviewService {

	private ReviewDAO mapper ;
	public int updateReview(Map<String, String> updateReviewMap) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ReviewDAO.class);
		int result = mapper.updateReview(updateReviewMap);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

}
