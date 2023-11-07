package com.petnolja.semi.member.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.post.model.dao.FaqSelectDAO;

public class FaqSelectService {
	private FaqSelectDAO faqSelectDAO;
	
	public List<AdminPostDTO> selectFaq() {
		SqlSession sqlSession = getSqlSession();
		
		faqSelectDAO = sqlSession.getMapper(FaqSelectDAO.class);
		
		List<AdminPostDTO> faqList = faqSelectDAO.selectFaq();
		
		sqlSession.close();
		
		return faqList;
	}
	
}
