package com.petnolja.semi.member.review.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;
import com.petnolja.semi.member.common.dto.UpdateReviewTextDTO;
import com.petnolja.semi.member.review.model.dao.ReviewDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class UpdateReviewFormService{
	
		private ReviewDAO mapper;
	
	public List<UpdateReviewTextDTO> updateReviewText(String reviewNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(ReviewDAO.class);
		
		List<UpdateReviewTextDTO> updateReviewTextList = mapper.updateReviewForm(reviewNo);
		sqlSession.close();
		
		return updateReviewTextList;
	}

}
