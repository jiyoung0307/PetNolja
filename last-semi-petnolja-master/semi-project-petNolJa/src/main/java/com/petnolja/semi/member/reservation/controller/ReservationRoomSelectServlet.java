package com.petnolja.semi.member.reservation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.common.dto.RoomDTO;
import com.petnolja.semi.member.reservation.model.service.ReservationService;

@WebServlet("/reservation/room")
public class ReservationRoomSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int amount = Integer.valueOf(request.getParameter("amount"));
		java.sql.Date checkIn = java.sql.Date.valueOf(request.getParameter("checkIn"));
		java.sql.Date checkOut = java.sql.Date.valueOf(request.getParameter("checkOut"));
		System.out.println("checkIn" + checkIn);
		System.out.println("checkOut" + checkOut);
		
		ReservationDTO reservationInfo = new ReservationDTO();
		reservationInfo.setReservationAmount(amount);
		reservationInfo.setReservationCheckIn(checkIn);
		reservationInfo.setReservationCheckOut(checkOut);
		reservationInfo.setUserNo(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		
		List<RoomDTO> roomList = new ReservationService().selectAllRoomPost();
		session.setAttribute("reservationInfo", reservationInfo);
		request.setAttribute("roomList", roomList);
		request.getRequestDispatcher("/WEB-INF/views/member/reservation/reservationRoom.jsp").forward(request, response);
	}
}
