package com.petnolja.semi.member.post.model.service;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.common.dto.QuestionDTO;
import com.petnolja.semi.member.post.model.dao.FaqSelectDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class FaqDetailService {

	private FaqSelectDAO mapper;
	public AdminPostDTO faqDetail(String faqNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(FaqSelectDAO.class);
		
		AdminPostDTO questionDTO = mapper.faqDetail(faqNo);
		return questionDTO;
	}

}
