package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.post.model.service.FaqSelectService;
import com.petnolja.semi.member.post.model.service.NoticeSelectService;

@WebServlet("/member/faq/select")
public class FaqSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<AdminPostDTO> faqList = new FaqSelectService().selectFaq();
		
		for(AdminPostDTO board : faqList) {
			System.out.println(board);
		}
		
//		System.out.println("나오니" + faqList);
		
		String path="";
		if(faqList != null) {
			path = "/WEB-INF/views/member/post/faqList.jsp";
			request.setAttribute("faqList", faqList);
		} else {
			path = "/WEB-INF/views/common/memberFailedPage.jsp";
			request.setAttribute("message", "FAQ 조회 실패!");
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

}
