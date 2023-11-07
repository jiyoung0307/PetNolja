package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.QuestionDTO;
import com.petnolja.semi.member.post.model.service.QuestionService;

@WebServlet("/question/select")
public class QuestionSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int memberNo = ((MemberDTO)session.getAttribute("loginMember")).getMemberNo();
				
		List<QuestionDTO> questionSelectList = new QuestionService().selectQuestion(memberNo);
		
		for(QuestionDTO board : questionSelectList) {
			System.out.println(board);
		}
		
//		System.out.println("여기는 1:1문의 조회 서블렛" + questionSelectList);
		
		String path="";
		if(questionSelectList != null) {
			path="/WEB-INF/views/member/myPage/questionSelect.jsp";
			request.setAttribute("questionSelectList", questionSelectList);
		} else {
			path="/WEB-INF/views/common/memberFailedPage.jsp";
			request.setAttribute("message", "1:1 문의 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
