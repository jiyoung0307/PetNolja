package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;
import com.petnolja.semi.member.common.dto.UpdateReviewTextDTO;
import com.petnolja.semi.member.review.model.service.UpdateReviewFormService;

@WebServlet("/updateReviewForm")
public class UpdateReviewFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UpdateReviewFormService updateReviewTextService = new UpdateReviewFormService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/member/review/updateReviewText.jsp";
		
		String reviewNo = request.getParameter("reviewNo");
		System.out.println("reviewNO? " + reviewNo);
		List<UpdateReviewTextDTO> updateReviewTextList = updateReviewTextService.updateReviewText(reviewNo);
		
		UpdateReviewTextDTO updateReviewDTO = updateReviewTextList.get(0);
		System.out.println(updateReviewDTO);
		int reviewRate = updateReviewDTO.getReviewRate(); 
		String reviewContexts = updateReviewDTO.getReviewContents();  
		
		
		request.setAttribute("updateList", updateReviewTextList);
		request.setAttribute("reviewRate", reviewRate);
		request.setAttribute("reviewContexts", reviewContexts);
		request.setAttribute("reviewNo", reviewNo);
		
//		System.out.println(updateReviewTextList);
		request.getRequestDispatcher(path).forward(request, response);
	}
}
