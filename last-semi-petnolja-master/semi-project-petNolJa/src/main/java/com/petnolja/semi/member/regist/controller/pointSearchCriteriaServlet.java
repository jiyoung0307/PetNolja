package com.petnolja.semi.member.regist.controller;



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

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.PointAccDTO;
import com.petnolja.semi.member.regist.model.service.PointSearchCriteriaService;

@WebServlet("/pointSearchCriteria")
public class pointSearchCriteriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private PointSearchCriteriaService pointSearchCriteriaService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pointSearchCriteriaService = new PointSearchCriteriaService(); 
		
		String path = "/WEB-INF/views/member/mypage/pointAcc.jsp";
		String month = request.getParameter("value");
//		 System.out.println(month);
		
		HttpSession httpSession = request.getSession();
		String memberNo = String.valueOf(((MemberDTO)httpSession.getAttribute("loginMember")).getMemberNo());
		
		Map<String, String> pointMap = new HashMap<>();
		pointMap.put("month", month);
		pointMap.put("memberNo", memberNo);
		
		 
		 List<PointAccDTO> pointList = pointSearchCriteriaService.selectPointList(pointMap);
		 System.out.println("(pointList: " + pointList);
		 request.setAttribute("pointList", pointList);
		 
		 request.getRequestDispatcher(path).forward(request, response);
		 /* 사용가능 포인트, 사용날짜, 사용 포인트 need */
		 
		 
	}

}
