package com.petnolja.semi.member.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.LocationDTO;
import com.petnolja.semi.member.post.model.service.SelectLocationIntroForMemberService;


@WebServlet("/SelectLocationIntro")
public class SelectLocationIntroForMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectLocationIntroForMemberService selectLocationIntroForMemberService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		selectLocationIntroForMemberService = new SelectLocationIntroForMemberService();
		
		LocationDTO locationdto = selectLocationIntroForMemberService.LocationDetail();
		
		System.out.println(locationdto);
		
		request.setAttribute("locationdto", locationdto);
		
		request.getRequestDispatcher("/WEB-INF/views/member/post/SelectLocationIntroForMember.jsp").forward(request, response);
	}


}
