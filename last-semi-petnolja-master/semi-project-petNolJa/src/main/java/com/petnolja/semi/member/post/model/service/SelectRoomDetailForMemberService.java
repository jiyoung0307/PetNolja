package com.petnolja.semi.member.post.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.member.common.dto.selectRoomDetailDTO;
import com.petnolja.semi.member.post.model.dao.MemberPostDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;


public class SelectRoomDetailForMemberService {
	MemberPostDAO mapper;
	
	public RoomPostAndAdminPictureDTO selectRoomDetailParameter(String roomPostNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(MemberPostDAO.class);
		
		RoomPostAndAdminPictureDTO SelectRoomDetailForMemberDTO = mapper.selectRoomDetailParameter(roomPostNo);
		
		sqlSession.close();
		
		return SelectRoomDetailForMemberDTO;
	}

	}

