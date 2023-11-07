package com.petnolja.semi.member.mypage.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;
import com.petnolja.semi.member.mypage.model.dao.MyPageDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
public class SelectReviewLogService {
	
	private MyPageDAO mapper; 
	
	public List<SelectAllReviewDTO> selectReviewLog(int memberNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MyPageDAO.class);
		List<SelectAllReviewDTO> selectReviewLogList = mapper.selectReviewLog(memberNo);
		
		sqlSession.close();
				
		
		return selectReviewLogList;
	}

}
