package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.PointAccDTO;
import com.petnolja.semi.member.regist.model.service.PointSearchCriteriaService;

@WebServlet("/mypage/pointAcc")
public class pointAccServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private PointSearchCriteriaService pointSearchCriteriaService;
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      pointSearchCriteriaService = new PointSearchCriteriaService();
//      System.out.println("Controller 잘 왔나?");
      
      String path = "/WEB-INF/views/member/mypage/pointAcc.jsp";
      
      HttpSession httpSession = request.getSession();
      
      int memberNo = ((MemberDTO)httpSession.getAttribute("loginMember")).getMemberNo();
      System.out.println("memberNo: " + memberNo);
      
      List<PointAccDTO> memberPointList = pointSearchCriteriaService.getPointAcc(memberNo);
      System.out.println("memberPoint: " + memberPointList);
      
      request.setAttribute("pointList", memberPointList);
      request.getRequestDispatcher(path).forward(request, response);
   }

}