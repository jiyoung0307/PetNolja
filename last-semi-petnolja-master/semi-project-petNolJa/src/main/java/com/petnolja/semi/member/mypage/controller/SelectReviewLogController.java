package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;
import com.petnolja.semi.member.mypage.model.service.SelectReviewLogService;

@WebServlet("/selectReviewLog")
public class SelectReviewLogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectReviewLogService selectReviewLogService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/member/mypage/selectReviewlog.jsp";
		
//		System.out.println(Integer.valueOf(request.getParameter("memberNo")));
		HttpSession session = request.getSession();
		int memberNo = Integer.valueOf(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		System.out.println("memberNO==="+memberNo);
		selectReviewLogService = new SelectReviewLogService();
		List<SelectAllReviewDTO> selectReviewLogList = selectReviewLogService.selectReviewLog(memberNo);
		
		request.setAttribute("selectReviewLogList", selectReviewLogList);
		System.out.println(selectReviewLogList);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
