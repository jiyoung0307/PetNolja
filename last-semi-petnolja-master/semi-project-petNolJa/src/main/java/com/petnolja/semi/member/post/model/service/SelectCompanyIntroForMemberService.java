package com.petnolja.semi.member.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.AdminPictureAndRoomPostDTO;
import com.petnolja.semi.member.common.dto.CompanyDTO;
import com.petnolja.semi.member.post.model.dao.MemberPostDAO;

public class SelectCompanyIntroForMemberService {
	private MemberPostDAO mapper;
//	
//	public List<AdminPictureAndRoomPostDTO> SelectRoomDetailParameter() {
//		SqlSession sqlSession = getSqlSession();
//		mapper = sqlSession.getMapper(MemberPostDAO.class);
//		
//		List<AdminPictureAndRoomPostDTO> SelectRoomListForMemberList = mapper.SelectRoomListParameter();
//		
//		sqlSession.close();
//		
//		return SelectRoomListForMemberList;
//	}

	public CompanyDTO CompanyDetail() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberPostDAO.class);
		
		CompanyDTO compnaydto = mapper.selectCompanyPost();
		
		System.out.println("서비스 dto 확인용 " + compnaydto);
		
		return compnaydto;
	}


}
