package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.mypage.model.service.MypageService;

@WebServlet("/member/coupon")
public class SelectCouponServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int userNo = Integer.valueOf(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		List<MemberCouponDTO> couponList = new MypageService().selectAllCouponList(userNo);
		
		request.setAttribute("couponList", couponList);
		request.getRequestDispatcher("/WEB-INF/views/member/mypage/coupon.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
