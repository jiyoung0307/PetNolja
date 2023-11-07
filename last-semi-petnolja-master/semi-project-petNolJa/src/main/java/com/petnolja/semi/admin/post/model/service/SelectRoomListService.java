package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.RoomPostAndEmployeeDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;
public class SelectRoomListService {

	AdminPostDAO mapper; 

	public List<RoomPostAndEmployeeDTO> selectroomList() {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class); 
		
		List<RoomPostAndEmployeeDTO> selectRoomList = mapper.selectRoomList();
		
		return selectRoomList;
		
	}

}
