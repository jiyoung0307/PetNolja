package com.petnolja.semi.member.pet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.pet.model.service.PetService;

@WebServlet("/member/pet/modify")
public class petUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int petNo = Integer.valueOf(request.getParameter("petNo"));
//		System.out.println("petNo 출력 확인용" + petNo);
		
//		PetDTO petUpdate = new PetService().petUpdate(petNo);
//		System.out.println(petUpdate);
		
//		request.setAttribute("petUpdate", petUpdate);
//		request.setAttribute("petNo", petNo);
//		request.getRequestDispatcher("");
		
	
	}

}
