package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.post.model.service.NoticeDetailService;

@WebServlet("/noticeDetail")
public class noticeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private NoticeDetailService noticeDetailService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		noticeDetailService = new NoticeDetailService();
		
		String path = "/WEB-INF/views/member/post/noticeDetail.jsp";
		String noticeNo = request.getParameter("noticeNo");
//		System.out.println("noticeNo: " + noticeNo);
		
		AdminPostDTO noticeDTO = noticeDetailService.noticeDetail(noticeNo);
//		System.out.println("questionDTO: " + noticeDTO);
		request.setAttribute("noticeDTO", noticeDTO);
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
