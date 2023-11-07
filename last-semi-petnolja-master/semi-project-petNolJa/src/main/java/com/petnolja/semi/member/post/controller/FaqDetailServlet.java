package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.common.dto.QuestionDTO;
import com.petnolja.semi.member.post.model.service.FaqDetailService;

@WebServlet("/faqDetail")
public class FaqDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FaqDetailService faqDetailService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "/WEB-INF/views/member/post/faqDetail.jsp";
		faqDetailService = new FaqDetailService();

		String faqNo = request.getParameter("faqNo");
//	System.out.println("faqNo: " + faqNo);

		AdminPostDTO questionDTO = faqDetailService.faqDetail(faqNo);
		System.out.println("questionDTO: " + questionDTO);

		request.setAttribute("questionDTO", questionDTO);
		request.getRequestDispatcher(path).forward(request, response);

	}

}
