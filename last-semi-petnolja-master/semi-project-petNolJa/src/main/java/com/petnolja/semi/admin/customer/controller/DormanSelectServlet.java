package com.petnolja.semi.admin.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.DormanMemberDTO;
import com.petnolja.semi.admin.customer.model.service.DormanSelectService;

@WebServlet("/admin/dorman/select")
public class DormanSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<DormanMemberDTO> dormanList = new DormanSelectService().selectDorman();
		
		for(DormanMemberDTO board : dormanList) {
			System.out.println(board);
		}
		
		System.out.println("dormanServlet 도착" + dormanList);
		
		String path="";
		if(dormanList != null) {
			path="/WEB-INF/views/admin/customer/dormanMemSelect.jsp";
			request.setAttribute("dormanList", dormanList);
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "휴면회원 조회에 실패하였습니다!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
