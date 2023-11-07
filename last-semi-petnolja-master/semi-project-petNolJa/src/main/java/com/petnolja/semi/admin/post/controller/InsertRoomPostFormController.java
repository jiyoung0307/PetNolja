package com.petnolja.semi.admin.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertRoomPostForm")
public class InsertRoomPostFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "\\WEB-INF\\views\\admin\\post\\insertRoomPostForm.jsp";
		
		System.out.println(request.getRequestURI());
		
		
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
