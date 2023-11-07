package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/regist/complete")
public class MemberRegistCompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("여기 complete 서블릿");
		request.getRequestDispatcher("/WEB-INF/views/member/regist/regist3.jsp").forward(request, response);
	}


}
