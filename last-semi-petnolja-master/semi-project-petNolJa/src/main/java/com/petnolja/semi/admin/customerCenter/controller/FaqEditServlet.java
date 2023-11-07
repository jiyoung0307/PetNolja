package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostAndEmployeeDTO;
import com.petnolja.semi.admin.customerCenter.model.service.CustomerCenterService;

@WebServlet("/faq/edit")
public class FaqEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/* 수정 연결 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int faqNo = Integer.parseInt((request.getParameter("no")));
		AdminPostAndEmployeeDTO admin = new CustomerCenterService().selectDetailNoticea(faqNo);
		request.setAttribute("adminList", admin);
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/faqModify.jsp").forward(request, response);
	}
	
	/* 삭제 연결 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int faqNo = Integer.valueOf(request.getParameter("faqNo"));
		System.out.println("faq 삭제 번호: " + faqNo);
		
		int result = new CustomerCenterService().deleteAdminPost(faqNo);
		
		if(result > 0) {
			response.setContentType("application/json; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print(result);
			out.flush();
			out.close();
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/adminFailedPage.jsp").forward(request, response);
		}
	}

}
