package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AnswerDTO;
import com.petnolja.semi.admin.customerCenter.model.service.AnswerService;

@WebServlet("/admin/answer/insert")
public class AnswerInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		/* 1:1 문의 답글 성공 */
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/1n1Insert.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String answerTitle = request.getParameter("ANSWER_TITLE");
		String answerContents = request.getParameter("ANSWER_CONTENTS");
		int empId = Integer.valueOf(request.getParameter("EMP_ID"));
		
		AnswerDTO answer = new AnswerDTO();
		answer.setAnswerTitle(answerTitle);
		answer.setAnswerContents(answerContents);
		answer.setEmpId(empId);
		
//		System.out.println(answer);
		
		AnswerService answerService = new AnswerService();
		int result = answerService.answerInsert(answer);
		
		String path="";
		if(result > 0) {
			path="/WEB-INF/views/admin/customerCenter/1n1InsertConfirm.jsp";
			request.setAttribute("successCode", "insertAnswer");
		} else {
			path="/WEB-INF/views/common/adminFailed.jsp";
			request.setAttribute("message", "답변 등록에 실패하셨습니다.");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
