package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.AdminLogInService;
import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.regist.model.service.MemberService;

@WebServlet("/common/login")
public class memberLoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/regist/logIn.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);

		Map<String, String> logIn = new HashMap<String, String>();
		logIn.put("id", id);
		logIn.put("pwd", pwd);
		
		EmployeeDTO empLogin = null;
		MemberDTO memberLogin = null;
		
		if(id.replaceAll("[0-9]", "").equals("")) {
			System.out.println(logIn.get("id"));
			empLogin = new AdminLogInService().empLogInCheck(logIn);
		} else {
			memberLogin = new MemberService().memberLogInCheck(logIn);
		}
		
		System.out.println(memberLogin);
		
		if(empLogin != null) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(6000);
			session.setAttribute("loginMember", empLogin);
			session.setAttribute("role", "admin");
			
			response.sendRedirect("../admin/main");
		} else if(memberLogin != null) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(6000);
			session.setAttribute("loginMember", memberLogin);
			session.setAttribute("role", "member");
			
			response.sendRedirect(request.getContextPath());
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/memberFailedPage.jsp").forward(request, response);
		}
		
	}

}
