package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.mypage.model.service.MemberInfoSelectService;

@WebServlet("/member/info/select")
public class MemberInfoSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<MemberDTO> infoMemberList = new MemberInfoSelectService().selectInfoMember();
		
		for(MemberDTO board : infoMemberList) {
			System.out.println("servlet: " + board);
		}
		
		String path="";
		if(infoMemberList != null) {
			path="/WEB-INF/views/member/mypage/selectMemberInfo.jsp";
			request.setAttribute("infoMemberList", infoMemberList);
			request.setAttribute("crud", "select");
		} else {
			path="/WEB-INF/views/common/memberFailedPage.jsp";
			request.setAttribute("message", "회원 정보 조회에 실패했습니다!");
		}
		request.getRequestDispatcher(path).forward(request, response);
	}


}
