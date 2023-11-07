package com.petnolja.semi.member.pet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.pet.model.service.PetService;

@WebServlet("/member/pet/select")
public class petSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int memberNo = ((MemberDTO) session.getAttribute("loginMember")).getMemberNo();
		
		List<PetDTO> petList = new PetService().petSelect(memberNo);
		
		for(PetDTO board : petList) {
			System.out.println(board);
		}
		
		String path="";
		if(petList != null) {
			path="/WEB-INF/views/member/pet/PetSelect.jsp";
			request.setAttribute("petList", petList);
		} else {
			path="";
			request.setAttribute("message", "반려동물 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
