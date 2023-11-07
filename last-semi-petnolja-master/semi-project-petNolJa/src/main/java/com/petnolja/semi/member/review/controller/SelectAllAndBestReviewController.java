package com.petnolja.semi.member.review.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.SelectAllReviewDTO;
import com.petnolja.semi.member.common.dto.SelectBestReviewDTO;
import com.petnolja.semi.member.review.model.service.SelectAllAndBestReviewService;

@WebServlet("/selectAllAndBestReview")
public class SelectAllAndBestReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SelectAllAndBestReviewService selectAllAndBestReviewService;
	
	public SelectAllAndBestReviewController() {
		
		/* 초기화 시 mapper까지 준비 */
		selectAllAndBestReviewService = new SelectAllAndBestReviewService();
	} 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<SelectBestReviewDTO> selectBestReviewList = selectAllAndBestReviewService.selectBestReview();
		
		List<SelectAllReviewDTO> selectAllReviewList = selectAllAndBestReviewService.selectAllReview();
		
		System.out.println(request.getParameter("ReviewNo"));
		
		request.setAttribute("SelectBestReviewList", selectBestReviewList);
		request.setAttribute("selectAllReviewList", selectAllReviewList);
		
		System.out.println("best"+selectBestReviewList);
		System.out.println("all"+selectAllReviewList);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/member/review/selectAllAndBestReview.jsp");
		rd.forward(request, response);
	}
}

