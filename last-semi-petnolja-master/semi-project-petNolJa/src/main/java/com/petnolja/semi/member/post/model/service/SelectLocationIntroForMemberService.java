package com.petnolja.semi.member.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.LocationDTO;
import com.petnolja.semi.member.post.model.dao.MemberPostDAO;

public class SelectLocationIntroForMemberService {
	private MemberPostDAO mapper;
	
	
	public LocationDTO LocationDetail() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberPostDAO.class);
		
		LocationDTO locationdto = mapper.selectLocationPost();
		
		System.out.println("서비스 dto 확인용 " + locationdto);
		
		return locationdto;
	}
	
}
	