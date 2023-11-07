package com.petnolja.semi.admin.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.employee.model.service.MemberSelectService;
import com.petnolja.semi.member.common.dto.MemberDTO;

@WebServlet("/admin/member/select")
public class MemberSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<MemberDTO> memList = new MemberSelectService().selectMember();
		
		for(MemberDTO board : memList) {
			System.out.println(board);
		}
		
		System.out.println("서블릿 도착" + memList);
		
		String path="";
		if(memList != null) {
			path="/WEB-INF/views/admin/employee/MemberSelect.jsp";
			request.setAttribute("memList", memList);
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "회원 정보 조회 실패!");
		}
	
		request.getRequestDispatcher(path).forward(request, response);
	}
}
