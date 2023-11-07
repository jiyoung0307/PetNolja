package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.petnolja.semi.admin.common.dto.QuestionDTO;
import com.petnolja.semi.admin.customerCenter.model.service.AnswerService;

@WebServlet("/admin/answer/select")
public class AnswerSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<QuestionDTO> questionList = new AnswerService().selectAllQuestion();
		
		for(QuestionDTO board : questionList) {
			System.out.println(board);
		}
		
		String path="";
		if(questionList != null) {
			path="/WEB-INF/views/admin/customerCenter/1n1Select.jsp";
			request.setAttribute("questionList", questionList);
		} else {
			path = "/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "1:1 문의 조회 실패!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}
}
