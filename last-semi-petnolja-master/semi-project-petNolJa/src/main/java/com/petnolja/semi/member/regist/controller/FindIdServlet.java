package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.regist.model.service.FindIdService;

@WebServlet("/regist/findId")
public class FindIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FindIdService findIdService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/member/regist/idDiscover.jsp";
		
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/member/regist/idDiscover2.jsp";
		findIdService = new FindIdService();
		MemberDTO memberDTO = new MemberDTO();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		memberDTO.setMemberName(name);
		memberDTO.setMemberEmail(email);
		
//		System.out.println("name" + name);
//		System.out.println("email" + email);
//		System.out.println("memberDTO 전" + memberDTO);
		memberDTO = findIdService.findId(memberDTO);
//		 System.out.println("memberDTO 후" + memberDTO);
		 
		if(memberDTO.getMemberId() != null) {
			String modifyId =memberDTO.getMemberId().substring(0, 4) + "****"; 
			memberDTO.setMemberId(modifyId);
			System.out.println("modify" + modifyId);
			request.setAttribute("memberDTO", memberDTO);
			request.getRequestDispatcher(path).forward(request, response);
		}else {
			request.setAttribute("memberDTO", "찾으시는 ID가 없습니다.");
			request.getRequestDispatcher(path).forward(request, response);
		}

		 
		 
		
	}

}
