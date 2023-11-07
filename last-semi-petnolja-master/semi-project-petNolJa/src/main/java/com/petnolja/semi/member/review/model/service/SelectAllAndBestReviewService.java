package com.petnolja.semi.member.review.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;
import com.petnolja.semi.member.common.dto.SelectBestReviewDTO;
import com.petnolja.semi.member.common.dto.SelectBestReviewDTO;
import com.petnolja.semi.member.review.model.dao.ReviewDAO;

public class SelectAllAndBestReviewService {

	private ReviewDAO mapper;
	
	public List<SelectBestReviewDTO> selectBestReview() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ReviewDAO.class);
		
		List<SelectBestReviewDTO> selectBestReviewList = mapper.selectBestReview();
		sqlSession.close();
		return selectBestReviewList;
	}

	
	public List<SelectAllReviewDTO> selectAllReview() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ReviewDAO.class);
		
		List<SelectAllReviewDTO> selectAllReviewList = mapper.selectAllReview();
		sqlSession.close();
		
		return selectAllReviewList;
	}

}
