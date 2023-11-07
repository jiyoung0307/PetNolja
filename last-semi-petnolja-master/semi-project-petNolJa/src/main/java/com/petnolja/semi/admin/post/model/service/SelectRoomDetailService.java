package com.petnolja.semi.admin.post.model.service;

import com.petnolja.semi.admin.common.dto.SelectRoomDetailDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class SelectRoomDetailService {

	private AdminPostDAO mapper;

	public SelectRoomDetailDTO selectRoomDetail(String roomPostNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		SelectRoomDetailDTO roomPostDTO = mapper.selectRoomDetail(roomPostNo);
		System.out.println("SelectRoomDetailDTO에 pictureNo 나오나,,"+ roomPostDTO);
		return roomPostDTO;
	}

}
