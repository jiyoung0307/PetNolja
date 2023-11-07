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
import com.petnolja.semi.member.common.dto.PaymentDTO;
import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.common.dto.PetsitterReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationPetDTO;
import com.petnolja.semi.member.reservation.model.service.ReservationService;

@WebServlet("/reservation/payment")
public class ReservationPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int petsitterNo = Integer.parseInt(request.getParameter("no"));
		
		ReservationDTO reservationInfo = (ReservationDTO)session.getAttribute("reservationInfo");
		int roomPrice = reservationInfo.getRoom().getRoomPrice();
		PetsitterReservationDTO petsitterInfo = new ReservationService().selectPetsitterInfo(petsitterNo);
		int petsitterPrice = petsitterInfo.getAbility().getAbilityMoney();
		reservationInfo.setPetsitter(petsitterInfo);
		
		int userNo = ((MemberDTO)session.getAttribute("loginMember")).getMemberNo();
		reservationInfo.setReservationPrice(roomPrice + petsitterPrice);
		
		List<PetDTO> petList = new ReservationService().selectPetList(userNo);
		List<MemberCouponDTO> couponList = new ReservationService().selectAllMemberCoupon(userNo);
		
		session.setAttribute("reservationInfo", reservationInfo);
		request.setAttribute("petList", petList);
		request.setAttribute("couponList", couponList);
		request.getRequestDispatcher("/WEB-INF/views/member/reservation/reservationPayment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기로 오기는 하니..?");
		
		ReservationPetDTO pet = new ReservationPetDTO();
		pet.setPetDoC(request.getParameter("DoCtype"));
		pet.setPetName(request.getParameter("name"));
		pet.setPetCharacter(request.getParameter("sociability"));
		pet.setPetType(request.getParameter("type"));
		pet.setHealth(request.getParameter("health"));
		pet.setPetWeight(Integer.valueOf(request.getParameter("weight")));
		pet.setPetEtc(request.getParameter("etc"));
		pet.setPetAge(Integer.valueOf(request.getParameter("age")));
		pet.setPerioVaccinate(request.getParameter("vaccination"));
		pet.setPetSex(request.getParameter("sex"));
		pet.setRabiesVaccinate(request.getParameter("raibies"));
		pet.setPetNeuter(request.getParameter("neuter"));
		
		HttpSession session = request.getSession();
		ReservationDTO reservationInfo = ((ReservationDTO)session.getAttribute("reservationInfo"));
		PaymentDTO payment = new PaymentDTO();
		int totalPrice = reservationInfo.getReservationPrice();
		int userNo = Integer.valueOf(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		pet.setMemberNo(userNo);
		payment.setUserNo(userNo);
		
		if(Integer.valueOf(request.getParameter("couponUsed")) > 0) {
			int useCouponNo = Integer.valueOf(request.getParameter("couponUsed"));
			int useCouponPrice = new ReservationService().selectUseCouponPrice(useCouponNo);
			int couponResult = new ReservationService().updateCouponUsed(userNo, useCouponNo);
			payment.setPaymentCouponPrice(useCouponPrice);
			totalPrice -= useCouponPrice;
		}
		
		System.out.println(request.getParameter("pointUse"));
		if(Integer.valueOf(request.getParameter("pointUse")) > 0 && request.getParameter("pointUse") != null) {
			int usePoint = Integer.valueOf(request.getParameter("pointUse"));
			int pointResult = new ReservationService().insertPointLog(userNo, usePoint);
			payment.setPaymentPointPrice(usePoint);
			totalPrice -= usePoint;
		}
		
		int result = new ReservationService().insertReservationAll(reservationInfo);
		int petResult = new ReservationService().insertReservationPet(pet);
		
		payment.setPaymentPrice(totalPrice);
		int paymentResult = new ReservationService().insertPayment(payment);

		session.removeAttribute("reservationInfo");
		session.removeAttribute("roomInfo");
		session.removeAttribute("roomList");
		
		PrintWriter out = response.getWriter();
		
		out.print(paymentResult);
		out.flush();
		out.close();
	}

}
