package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.review.model.service.DeleteReviewService;

import oracle.net.jdbc.nl.NLParamParser;


@WebServlet("/deleteReview")
public class DeleteReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final DeleteReviewService deleteReviewService = new DeleteReviewService();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession();
		String reviewNo = request.getParameter("reviewNo");
//		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginMember");
//		String memberNo = String.valueOf(memberDTO.getMemberNo()); 
		
		System.out.println("reviewNo"+reviewNo);
//		System.out.println("memberNo!!!!"+memberNo);
		
//		Map<String, String> parameterMap = new HashMap<>();
//		parameterMap.put("reviewNo", reviewNo);
//		parameterMap.put("memberNo", memberNo);
		
		int deleteReviewResult =  deleteReviewService.deleteReview(reviewNo);
		
		
		if(deleteReviewResult > 0) {
			response.sendRedirect("memberSuccessPage");
		}else {
			response.sendRedirect("memberFailedPage");
		}
		
		
		
		
		

	}


}
