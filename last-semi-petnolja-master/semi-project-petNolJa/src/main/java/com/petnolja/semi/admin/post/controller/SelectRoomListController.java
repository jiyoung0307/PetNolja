package com.petnolja.semi.admin.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.RoomPostAndEmployeeDTO;
import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.post.model.service.SelectRoomListService;

@WebServlet("/roomList")
public class SelectRoomListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SelectRoomListService roomListService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		roomListService = new SelectRoomListService();
		
		List<RoomPostAndEmployeeDTO> roomPostList = roomListService.selectroomList();
		
		request.setAttribute("roomPostList", roomPostList);
		System.out.println(roomPostList);
		String path = "/WEB-INF/views/admin/post/roomList.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

}
