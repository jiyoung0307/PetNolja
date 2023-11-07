package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.member.common.dto.selectRoomDetailDTO;
import com.petnolja.semi.member.post.model.service.SelectRoomDetailForMemberService;

@WebServlet("/selectRoomDetailForMember")
public class SelectRoomDetailForMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectRoomDetailForMemberService selectRoomDetailForMemberService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		selectRoomDetailForMemberService = new SelectRoomDetailForMemberService();
		String roomPostNo = request.getParameter("roomPostNo");
//		System.out.println(roomPostNo);
		
		RoomPostAndAdminPictureDTO SelectRoomDetailForMemberDTO = selectRoomDetailForMemberService.selectRoomDetailParameter(roomPostNo);
//		System.out.println("두둥: " + SelectRoomDetailForMemberDTO);
		request.setAttribute("SelectRoomDetailDTO", SelectRoomDetailForMemberDTO);
		
		String path = "\\WEB-INF\\views\\member\\post\\SelectRoomDetailForMember.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

}
