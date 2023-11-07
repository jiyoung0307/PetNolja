package com.petnolja.semi.member.review.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.mypage.model.dao.MyPageDAO;

public class DeleteReviewService {

	private MyPageDAO mapper;

	public int deleteReview(String reviewNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MyPageDAO.class);
		
//		String reviewNo =parameterMap.get("reviewNo");
//		String memberNo = parameterMap.get("memberNo");
//		System.out.println("service reviewNo"+reviewNo);
//		System.out.println("service memberNo"+memberNo);
		
		System.out.println("Service reviewNo: " + reviewNo);
		int deletePicture = mapper.deletePicture(reviewNo);
		int deleteReview = mapper.deleteReview(reviewNo);
		
		System.out.println("deletePicture: " + deletePicture);
		System.out.println("deleteReview: " + deleteReview);
		int result = 0;
		if (deleteReview > 0 && deletePicture > 0) {
			result = 1;
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result;
	}

}
