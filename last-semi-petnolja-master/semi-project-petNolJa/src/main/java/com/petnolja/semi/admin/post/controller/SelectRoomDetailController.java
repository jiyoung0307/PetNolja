package com.petnolja.semi.admin.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.petnolja.semi.admin.common.dto.SelectRoomDetailDTO;
import com.petnolja.semi.admin.post.model.service.InsertRoomPostService;
import com.petnolja.semi.admin.post.model.service.SelectRoomDetailService;


@WebServlet("/selectRoomDetail")
public class SelectRoomDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private InsertRoomPostService insertRoomPostService;
	private SelectRoomDetailService selectRoomDetailService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String path = "\\WEB-INF\\views\\admin\\post\\roomDetail.jsp";
		String roomPostNo = request.getParameter("roomPostNo");
		
//		pictureSaveRoute
		selectRoomDetailService = new SelectRoomDetailService();
		
		System.out.println("roomPostNo: " + roomPostNo);
		
		SelectRoomDetailDTO roomPostDTO = selectRoomDetailService.selectRoomDetail(roomPostNo);
		System.out.println("roomPostDTO: " + roomPostDTO);
//		System.out.println(roomPostDTO);
		
		request.setAttribute("roomPostDTO", roomPostDTO);
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
