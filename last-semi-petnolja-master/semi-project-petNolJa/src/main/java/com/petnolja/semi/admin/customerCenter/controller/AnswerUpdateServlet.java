package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AnswerDTO;
import com.petnolja.semi.admin.customerCenter.model.service.AnswerService;

@WebServlet("/admin/answer/update")
public class AnswerUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/1n1Modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String answerContents  = request.getParameter("answerContents");
		int questionNo = Integer.valueOf(request.getParameter("questionNo"));
		
		AnswerDTO answer = new AnswerDTO();
		answer.setAnswerContents(answerContents);
		answer.setQuestionNo(questionNo);
		
//		System.out.println(answer);
		
		AnswerService answerService = new AnswerService();
		int result = answerService.answerUpdate(answer);
		
		String path="";
		if(result > 0) {
			path="/WEB-INF/views/admin/customerCenter/1n1ModifyConfirm.jsp";
			request.setAttribute("successCode", "updateAnswer");
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "답변 수정에 실패하였습니다!");
		}
		
	}

}
