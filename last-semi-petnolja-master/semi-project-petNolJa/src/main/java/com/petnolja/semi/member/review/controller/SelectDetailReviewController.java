package com.petnolja.semi.member.review.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.ReviewAndUserPictureDTO;
import com.petnolja.semi.member.common.dto.SelectDetailReviewDTO;
import com.petnolja.semi.member.common.dto.UserPictureDTO;
import com.petnolja.semi.member.review.model.service.SelectDetailReviewService;

@WebServlet("/selectDetailReview")
public class SelectDetailReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SelectDetailReviewService selectDetailReviewService; 
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/member/review/selectDetailReview.jsp";
		
		selectDetailReviewService = new SelectDetailReviewService();
		String reviewNo = request.getParameter("ReviewNo");
			
		List<ReviewAndUserPictureDTO> selectDetailReviewList = selectDetailReviewService.selectDetailReview(reviewNo);
//		System.out.println(selectDetailReviewList);
		
		ReviewAndUserPictureDTO reviewDTO = selectDetailReviewList.get(0);
		System.out.println("reviewDTO: " + reviewDTO);
		
		List<UserPictureDTO> userPictureList = selectDetailReviewList.get(0).getUserPictureList();
		System.out.println("userPictureList" + userPictureList);
		
		
		/*수정버튼 안보이게 하려는 수작*/
		int memberNo = selectDetailReviewService.getMemberNo(reviewNo);
//		System.out.println(memberNo);
		request.setAttribute("memberNo", memberNo);
		request.setAttribute("reviewDTO", reviewDTO);
		request.setAttribute("userPictureList", userPictureList);
		System.out.println("userPictureList" + userPictureList);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
