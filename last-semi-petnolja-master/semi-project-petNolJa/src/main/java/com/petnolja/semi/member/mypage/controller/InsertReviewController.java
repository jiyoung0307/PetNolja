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

import com.petnolja.semi.member.mypage.model.service.InsertReviewService;

@WebServlet("/insertReview")
public class InsertReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	InsertReviewService insertReviewService;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		insertReviewService = new InsertReviewService();
		
		String rating = request.getParameter("rating");
		String reviewText= request.getParameter("reviewText");
		String reservationNo = request.getParameter("reservationNo");
		System.out.println(rating);
		System.out.println(reviewText);
		System.out.println("insertReview reservationNo: " + reservationNo);
		Map<String, String> insertReviewMap = new HashMap<>();
		insertReviewMap.put("rating", rating);
		insertReviewMap.put("reservationNo", reservationNo);
		insertReviewMap.put("reviewText", reviewText);
		int result = insertReviewService.insertReview(insertReviewMap);
		
		if(result > 0) {
			response.sendRedirect("memberSuccessPage");
		}else {
			response.sendRedirect("memberFailedPage");
		}
	}

}
