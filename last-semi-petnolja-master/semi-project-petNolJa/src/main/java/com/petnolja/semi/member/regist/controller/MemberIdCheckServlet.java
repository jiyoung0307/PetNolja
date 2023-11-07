package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.regist.model.service.MemberService;

@WebServlet("/member/check")
public class MemberIdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = null;
		String memberEmail = null;
		memberId = request.getParameter("memberId");
		memberEmail = request.getParameter("memberEmail");
		
		System.out.println(memberId);
		System.out.println(memberEmail);
		
		Map<String, String> memberCheck = new HashMap<String, String>();
		memberCheck.put("memberId", memberId);
		memberCheck.put("memberEmail", memberEmail);
		
		int result = new MemberService().selectRegistCheck(memberCheck);
		
		PrintWriter out = response.getWriter();
		
		out.print(result);
		out.flush();
		out.close();
		
	}

}
