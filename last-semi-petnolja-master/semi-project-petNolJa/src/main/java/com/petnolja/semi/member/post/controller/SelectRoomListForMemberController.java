package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.member.common.dto.AdminPictureAndRoomPostDTO;
import com.petnolja.semi.member.post.model.service.SelectRoomDetailForMemberService;
import com.petnolja.semi.member.post.model.service.SelectRoomListForMemberService;

@WebServlet("/selectRoomListForMember")
public class SelectRoomListForMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectRoomListForMemberService selectRoomListForMemberService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		selectRoomListForMemberService = new SelectRoomListForMemberService();
		
		List<RoomPostAndAdminPictureDTO> selectRoomForMemberList =
				selectRoomListForMemberService.SelectRoomDetailParameter();
		
		System.out.println(selectRoomForMemberList);
		
		request.setAttribute("selectRoomForMemberList", selectRoomForMemberList);
		
		String path = "\\WEB-INF\\views\\member\\post\\SelectRoomListForMember.jsp";
		request.getRequestDispatcher(path).forward(request, response);
		
	}


}
