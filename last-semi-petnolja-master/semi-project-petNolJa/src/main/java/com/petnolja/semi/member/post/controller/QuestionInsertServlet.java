package com.petnolja.semi.member.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.QuestionDTO;
import com.petnolja.semi.member.post.model.service.QuestionService;

@WebServlet("/question/insert")
public class QuestionInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 1:1 문의 등록 */
		request.getRequestDispatcher("/WEB-INF/views/member/post/questionInsert.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String questionTitle = request.getParameter("name");
		String questionContents = request.getParameter("textarea");
		int memberNo = 1;
		
		QuestionDTO question = new QuestionDTO();
		question.setQuestionTitle(questionTitle);
		question.setQuestionContents(questionContents);
		question.setMemberNo(memberNo);
		
//		System.out.println(question);
		
		QuestionService questionService = new QuestionService();
		int result = questionService.questionInsert(question);
				
		String path = "";
		if(result > 0){
			path = "/WEB-INF/views/member/post/questionInsertConfirm.jsp";
			request.setAttribute("successCode", "insertQuestion");
		} else {
			path = "/WEB-INF/views/common/memberFaild.jsp";
			request.setAttribute("message", "1:1 문의 등록에 실패하셨습니다.");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
