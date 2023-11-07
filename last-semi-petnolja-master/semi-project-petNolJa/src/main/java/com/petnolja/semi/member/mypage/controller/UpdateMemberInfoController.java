package com.petnolja.semi.member.mypage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.ReservationDTO;
import com.petnolja.semi.member.mypage.model.service.MemberInfoSelectService;
import com.petnolja.semi.member.mypage.model.service.MypageService;
import com.petnolja.semi.member.mypage.model.service.UpdateMemberInfoService;

@WebServlet("/updateMemberInfo")
public class UpdateMemberInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UpdateMemberInfoService updateMemberInfoService; 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<MemberDTO> infoMemberList = new MemberInfoSelectService().selectInfoMember();
		
		for(MemberDTO board : infoMemberList) {
			System.out.println("servlet: " + board);
		}
		
		String path="";
		if(infoMemberList != null) {
			path="/WEB-INF/views/member/mypage/selectMemberInfo.jsp";
			request.setAttribute("infoMemberList", infoMemberList);
			request.setAttribute("crud", "update");
		} else {
			path="/WEB-INF/views/common/memberFailedPage.jsp";
			request.setAttribute("message", "회원 정보 조회에 실패했습니다!");
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println("나오나요?");
		HttpSession session = request.getSession();
		
		String memberNo = String.valueOf(((MemberDTO)session.getAttribute("loginMember")).getMemberNo());
		String memberPhone = request.getParameter("phone");
		String memberEmail= request.getParameter("email"); 	
		System.out.println(memberNo);
		System.out.println(memberPhone);
		System.out.println(memberEmail);
		
		Map<String, String> updateMemberInfoMap = new HashMap<>();
		updateMemberInfoMap.put("memberPhone", memberPhone);
		updateMemberInfoMap.put("memberEmail", memberEmail);
		updateMemberInfoMap.put("memberNo", memberNo);
		updateMemberInfoService = new UpdateMemberInfoService();
		
		int result = updateMemberInfoService.updateMemberInfo(updateMemberInfoMap);
		
		if(result > 0) {
			session.invalidate();
			response.sendRedirect("updateInfoSuccess");
		}else {
			response.sendRedirect("memberFailedPage");
		}

	}

}
