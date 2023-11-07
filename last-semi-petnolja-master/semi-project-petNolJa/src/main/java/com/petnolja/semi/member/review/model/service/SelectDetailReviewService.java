package com.petnolja.semi.member.review.model.service;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;
import com.petnolja.semi.member.common.dto.SelectDetailReviewDTO;
import com.petnolja.semi.member.review.model.dao.ReviewDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;
public class SelectDetailReviewService {

	private ReviewDAO mapper;
	
	public List<ReviewAndUserPictureDTO> selectDetailReview(String reviewNo) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ReviewDAO.class);
		List<ReviewAndUserPictureDTO> selectDetailReviewList = mapper.selectDetailReview(reviewNo);

		sqlSession.close();
		
		return selectDetailReviewList;
	}

	public int getMemberNo(String reviewNo) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ReviewDAO.class);
		int result = mapper.getMemberNo(reviewNo);
		sqlSession.close();
		return result;
	}

}
