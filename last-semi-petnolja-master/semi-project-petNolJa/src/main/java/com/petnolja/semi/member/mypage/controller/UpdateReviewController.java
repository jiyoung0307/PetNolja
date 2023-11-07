package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.review.model.service.UpdateReviewService;

@WebServlet("/updateReview")
public class UpdateReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final UpdateReviewService updateReviewService  = new UpdateReviewService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rating = request.getParameter("rating");
		String reviewText = request.getParameter("reviewText");
		String reviewNo = request.getParameter("reviewNo");
		
		
		System.out.println("rating"+rating);
		System.out.println(reviewText);
		System.out.println(reviewNo);
		Map<String, String> updateReviewMap = new HashMap<>();
		updateReviewMap.put("rating", rating);
		updateReviewMap.put("reviewText", reviewText);
		updateReviewMap.put("reviewNo", reviewNo);
		int result = updateReviewService.updateReview(updateReviewMap);
		
		if(result > 0) {
			response.sendRedirect("memberSuccessPage");
		}else {
			response.sendRedirect("memberFailedPage");
		}
	}

}
