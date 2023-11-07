package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.mypage.model.service.MemberInfoSelectService;
import com.petnolja.semi.member.regist.model.service.MemberService;

@WebServlet("/InsertWithDrawMember")
public class InsertWithDrawMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberService insertWithDrawMemberService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MemberDTO> infoMemberList = new MemberInfoSelectService().selectInfoMember();
		
		for(MemberDTO board : infoMemberList) {
			System.out.println("servlet: " + board);
		}
		
		String path="";
		if(infoMemberList != null) {
			path="/WEB-INF/views/member/mypage/selectMemberInfo.jsp";
			request.setAttribute("infoMemberList", infoMemberList);
			request.setAttribute("crud", "delete");
		} else {
			path="/WEB-INF/views/common/memberFailedPage.jsp";
			request.setAttribute("message", "회원 정보 조회에 실패했습니다!");
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id" + id);
		System.out.println("pwd" + pwd);
		
		Map<String, String> login = new HashMap<String, String>();
		login.put("id", id);
		login.put("pwd", pwd);
		System.out.println("jsp 받은 값" + pwd);
		MemberDTO member = new MemberService().memberLogInCheck(login);
		System.out.println("db 깂" + member.getMemberPwd());
		if(member.getMemberName().isEmpty()) {
			int result = 0;
			PrintWriter out = response.getWriter();
			out.print(result);
			out.flush();
			out.close();
		}
		
		int result = new MemberService().insertWithdrawMember(member);
		
		if(result > 0) {
			request.getSession().invalidate();
			PrintWriter out = response.getWriter();
			out.print(result);
			out.flush();
			out.close();
		}
	}

}
