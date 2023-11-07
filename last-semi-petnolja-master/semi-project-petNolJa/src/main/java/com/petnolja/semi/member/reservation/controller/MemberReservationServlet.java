package com.petnolja.semi.member.reservation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberCouponDTO;
import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.reservation.model.service.ReservationService;

@WebServlet("/member/reservation")
public class MemberReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/reservation/reservation1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int couponNo = Integer.valueOf(request.getParameter("couponNo"));
		int userNo = Integer.valueOf(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		int couponPrice = 0;
		List<MemberCouponDTO> couponList = new ReservationService().selectAllMemberCoupon(userNo);
		for(int i = 0; i < couponList.size(); i++) {
			if(couponList.get(i).getCouponNo() == couponNo) {
				couponPrice = couponList.get(i).getCoupon().getCouponDiscountPrice();
			}
		}
		
		PrintWriter out = response.getWriter();
		
		out.print(couponPrice);
		out.flush();
		out.close();
	}

}
