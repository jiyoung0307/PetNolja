package com.petnolja.semi.admin.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.common.dto.SelectRoomDetailDTO;
import com.petnolja.semi.admin.post.model.service.UpdateRoomPostFormService;
import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;

@WebServlet("/updateRoomPostForm")
public class UpdateRoomPostFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UpdateRoomPostFormService updateRoomPostFormService; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path ="\\WEB-INF\\views\\admin\\post\\UpdateRoomPostForm.jsp";
		
		updateRoomPostFormService = new UpdateRoomPostFormService();
		String roomPostNo = request.getParameter("roomPostNo");
//		System.out.println("UpdateRoomPost에서의 roomPostNo: " + roomPostNo);
		
		SelectRoomDetailDTO roomPostDTO = updateRoomPostFormService.updateRoomPost(roomPostNo);
		System.out.println("roomPostDTO? : " + roomPostDTO );
//		System.out.println("나오나 test"+roomPostDTO);
		request.setAttribute("roomPostDTO", roomPostDTO);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
