package com.petnolja.semi.member.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.CompanyDTO;
import com.petnolja.semi.member.post.model.service.SelectCompanyIntroForMemberService;
import com.petnolja.semi.member.post.model.service.SelectLocationIntroForMemberService;


@WebServlet("/SelectCompanyIntro")
public class SelectCompanyIntroForMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectCompanyIntroForMemberService selectCompanyIntroForMemberService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		selectCompanyIntroForMemberService = new SelectCompanyIntroForMemberService();
		
		CompanyDTO companydto = selectCompanyIntroForMemberService.CompanyDetail();
		
		System.out.println(companydto);
		
		request.setAttribute("companydto", companydto);
		
		request.getRequestDispatcher("/WEB-INF/views/member/post/SelectCompanyIntroForMember.jsp").forward(request, response);
	}


}
