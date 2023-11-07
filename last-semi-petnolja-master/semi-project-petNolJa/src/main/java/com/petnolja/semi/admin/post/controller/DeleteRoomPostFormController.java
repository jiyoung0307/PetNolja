package com.petnolja.semi.admin.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.post.model.service.DeleteRoomPostService;

@WebServlet("/deleteRoomPostForm")
public class DeleteRoomPostFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DeleteRoomPostService deleteRoomPostService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		deleteRoomPostService = new DeleteRoomPostService();
		String roomPostNo = request.getParameter("roomPostNo");
		
		int result = deleteRoomPostService.deleteRoomPost(roomPostNo);
		String path = "";
		if(result > 0) {
			path = "/WEB-INF/views/common/adminSuccessPage.jsp";
		} else {
			path = "/WEB-INF/views/common/adminFailedPage.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

}
