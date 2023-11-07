package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.CompanyPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class UpdateCompanyPostService {
	
	private AdminPostDAO mapper;

	public int updateCompanyPost(CompanyPostDTO companyPostDTO) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		int result = mapper.updateCompanyPost(companyPostDTO);
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}
}
