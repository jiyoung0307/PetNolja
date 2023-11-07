package com.petnolja.semi.member.review.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;
import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;
import com.petnolja.semi.member.common.dto.SelectBestReviewDTO;
import com.petnolja.semi.member.common.dto.SelectDetailReviewDTO;
import com.petnolja.semi.member.common.dto.UpdateReviewTextDTO;

public interface ReviewDAO {

	List<SelectBestReviewDTO> selectBestReview();

	List<SelectAllReviewDTO> selectAllReview();

	List<ReviewAndUserPictureDTO> selectDetailReview(String reviewNo);

	List<UpdateReviewTextDTO> updateReviewForm(String reviewNo);

	int updateReview(Map<String, String> updateReviewMap);

	int getMemberNo(String reviewNo);

	
	
}
