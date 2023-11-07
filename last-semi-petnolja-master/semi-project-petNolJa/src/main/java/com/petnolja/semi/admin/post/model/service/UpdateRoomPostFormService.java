package com.petnolja.semi.admin.post.model.service;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.common.dto.SelectRoomDetailDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
public class UpdateRoomPostFormService {

	private AdminPostDAO mapper;
	public SelectRoomDetailDTO updateRoomPost(String roomPostNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		SelectRoomDetailDTO roomPostDTO = mapper.selectRoomDetail(roomPostNo);
		System.out.println("roomPostDTO엔 뭐가 있을까요? " + roomPostDTO);
		return roomPostDTO;
	}

}
