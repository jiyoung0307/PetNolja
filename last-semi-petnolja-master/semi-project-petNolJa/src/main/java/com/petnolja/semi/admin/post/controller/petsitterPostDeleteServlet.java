package com.petnolja.semi.admin.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.post.model.service.AdminPostService;

@WebServlet("/petsitter/post/delete")
public class petsitterPostDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int petsitterPostNo = Integer.parseInt(request.getParameter("no"));
		System.out.println("petsitterPostNo 확인확인333" + petsitterPostNo);
		
		int result = new AdminPostService().deletePetsitterPost(petsitterPostNo);
		
		String path = "";
		if(result > 0) {
			path = "/WEB-INF/views/common/adminSuccessPage.jsp";
		} else {
			path = "/WEB-INF/views/common/adminFailedPage.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
