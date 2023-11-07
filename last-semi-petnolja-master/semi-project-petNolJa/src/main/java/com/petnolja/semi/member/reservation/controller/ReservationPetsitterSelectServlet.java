package com.petnolja.semi.member.reservation.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.common.paging.Pagenation;
import com.petnolja.semi.common.paging.SelectCriteria;
import com.petnolja.semi.member.common.dto.PetsitterReservationDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.common.dto.RoomDTO;
import com.petnolja.semi.member.reservation.model.service.ReservationService;

@WebServlet("/reservation/petsitter")
public class ReservationPetsitterSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int roomNo = Integer.parseInt(request.getParameter("no"));
		ReservationDTO reservationInfo = (ReservationDTO)session.getAttribute("reservationInfo");
		String checkIn = String.valueOf(reservationInfo.getReservationCheckIn());
		RoomDTO roomInfo = new ReservationService().selectRoomReservationInfo(roomNo);
		reservationInfo.setRoom(roomInfo);
		session.setAttribute("roomInfo", roomInfo);
		session.setAttribute("reservationInfo", reservationInfo);
		
		System.out.println("여기는 펫시터예약" + reservationInfo);
		
		String currentPage = request.getParameter("currentPage");
    	int pageNo = 1;
    	
    	if(currentPage != null && !"".equals(currentPage)) {
    		pageNo = Integer.parseInt(currentPage);
    	}
    	
    	String searchCondition = request.getParameter("searchCondition");
    	String searchValue = request.getParameter("searchValue");
    	
    	Map<String, String> searchMap = new HashMap<>();
    	searchMap.put("searchCondition", searchCondition);
    	searchMap.put("searchValue", searchValue);
    	
    	ReservationService reservationService = new ReservationService();
    	int totalCount = reservationService.selectTotalCount(checkIn);
    	
    	System.out.println("totalBoardCount : " + totalCount);
    	
    	/* 한 페이지에 보여 줄 게시물 수 */
    	int limit = 6;
    	/* 한 번에 보여질 페이징 버튼의 갯수 */
    	int buttonAmount = 3;
    	
    	/* 페이징 처리를 위한 로직 호출 후 페이징 처리에 관한 정보를 담고 있는 인스턴스를 반환받는다. */
    	SelectCriteria selectCriteria = null;
    	
    	if(searchCondition != null && !"".equals(searchValue)) {
    		selectCriteria = Pagenation.getSelectCriteria(pageNo, totalCount, limit, buttonAmount, searchCondition, searchValue);
    	} else {
    		selectCriteria = Pagenation.getSelectCriteria(pageNo, totalCount, limit, buttonAmount);
    	}
    	System.out.println(selectCriteria);
    	
    	List<PetsitterReservationDTO> petsitterList = reservationService.selectPetsitterList(selectCriteria, checkIn);
    	
    	for(PetsitterReservationDTO petSitter : petsitterList) {
    		System.out.println(petSitter);
    	}
    	
    	String path = "";
    	if(petsitterList != null) {
    		path = "/WEB-INF/views/member/reservation/reservationPetsitter.jsp";
    		request.setAttribute("petsitterList", petsitterList);
    		request.setAttribute("selectCriteria", selectCriteria);
    	} else {
    		path = "/WEB-INF/views/common/memberFaild.jsp";
    	}
    	request.getRequestDispatcher(path).forward(request, response);
	}
	
}
