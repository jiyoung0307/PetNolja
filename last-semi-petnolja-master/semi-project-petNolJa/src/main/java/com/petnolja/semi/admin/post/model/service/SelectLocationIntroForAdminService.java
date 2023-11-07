package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.LocationPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class SelectLocationIntroForAdminService {
	private AdminPostDAO mapper;
	
	public LocationPostDTO LocationIntro() {
		
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		LocationPostDTO locationPostdto = mapper.selectLocationPost();
		
		System.out.println("서비스 dto 확인용 " + locationPostdto);
		
		return locationPostdto;
	}

}
