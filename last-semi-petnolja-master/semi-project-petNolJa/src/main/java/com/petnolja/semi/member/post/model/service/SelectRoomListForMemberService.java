package com.petnolja.semi.member.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.member.common.dto.AdminPictureAndRoomPostDTO;
import com.petnolja.semi.member.post.model.dao.MemberPostDAO;

public class SelectRoomListForMemberService {
	private MemberPostDAO mapper;
	
	public List<RoomPostAndAdminPictureDTO> SelectRoomDetailParameter() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberPostDAO.class);
		
		List<RoomPostAndAdminPictureDTO> SelectRoomListForMemberList = mapper.SelectRoomListParameter();
		
		sqlSession.close();
		
		return SelectRoomListForMemberList;
	}
}
