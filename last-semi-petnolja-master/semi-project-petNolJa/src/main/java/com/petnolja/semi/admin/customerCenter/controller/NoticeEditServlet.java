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

@WebServlet("/notice/edit")
public class NoticeEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* 수정 연결 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 나와?");
		int noticeNo = Integer.parseInt((request.getParameter("no")));
		System.out.println("공지사항 수정.. ㅈㅔ발 나와!" + noticeNo);
		AdminPostAndEmployeeDTO admin = new CustomerCenterService().selectDetailNoticea(noticeNo);
		request.setAttribute("adminList", admin);
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/noticeModify.jsp").forward(request, response);
	}

	/* 삭제 연결 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeNo = Integer.valueOf(request.getParameter("noticeNo"));
		System.out.println("공지사항 삭제 번호: " + noticeNo);
		
		int result = new CustomerCenterService().deleteAdminPost(noticeNo);
		
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
