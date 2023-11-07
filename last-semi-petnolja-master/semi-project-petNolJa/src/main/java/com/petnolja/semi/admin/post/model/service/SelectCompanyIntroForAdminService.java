package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.CompanyPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class SelectCompanyIntroForAdminService {
	private AdminPostDAO mapper;
	public CompanyPostDTO CompanyIntro() {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		CompanyPostDTO companyPostdto = mapper.selectCompanyPost();
		
		System.out.println("서비스 dto 확인용 " + companyPostdto);
		
		return companyPostdto;
	}

}
