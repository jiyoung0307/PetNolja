package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.member.post.model.service.MemberPostService;

@WebServlet("/petsitter/postDetail")
public class PetsitterPostDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int petsitterPostNo = Integer.parseInt(request.getParameter("no"));
		System.out.println("petsitterPostNo" + petsitterPostNo);
		
		PetsitterPostDTO petsitterPostDetail = new MemberPostService().selectPetsitterPostDetail(petsitterPostNo);
		System.out.println(petsitterPostDetail);
		
		String path = "";
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("admin")) {
			path = "/WEB-INF/views/admin/post/adminPetsitterPostDetail.jsp";
			request.setAttribute("petsitterPostDetail", petsitterPostDetail);
			request.setAttribute("petsitterPostNo", petsitterPostNo);
		} else {
			if(petsitterPostDetail != null) {
				path = "/WEB-INF/views/member/post/petsitterPostDetail.jsp";
				request.setAttribute("petsitterPostDetail", petsitterPostDetail);
			} else {
				path = "/WEB-INF/views/common/memberFailedPage.jsp";
				request.setAttribute("message", "썸네일 게시판 상세 조회 실패!");
			}
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
