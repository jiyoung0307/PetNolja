package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.member.post.model.service.NoticeSelectService;

@WebServlet("/member/notice/select")
public class NoticeSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	List<AdminPostDTO> noticeList = new NoticeSelectService().selectAllNotice();
	
	for(AdminPostDTO board: noticeList) {
		System.out.println(board);
	}
	
	String path="";
	if(noticeList != null) {
		path = "/WEB-INF/views/member/post/noticeList.jsp";
		request.setAttribute("noticeList", noticeList);
	} else {
		path = "/WEB-INF/views/common/memberFailedPage.jsp";
		request.setAttribute("message", "공지사항 조회 실패!");
	}
	request.getRequestDispatcher(path).forward(request, response);
	
	
	}
}
