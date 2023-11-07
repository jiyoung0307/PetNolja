package com.petnolja.semi.member.mypage.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;

public interface MyPageDAO {

	int updateMemberInfo(Map<String, String> updateMemberInfoMap);

	List<SelectAllReviewDTO> selectReviewLog(int memberNo);
	
	MemberDTO checkUser(String memberNo);

	int deletePicture(String reviewNo);

	int deleteReview(String reviewNo);

	int insertReview(Map<String, String> insertReviewMap);


}
