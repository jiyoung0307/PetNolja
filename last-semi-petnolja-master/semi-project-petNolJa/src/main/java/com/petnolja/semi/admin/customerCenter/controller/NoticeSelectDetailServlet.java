package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostAndEmployeeDTO;
import com.petnolja.semi.admin.customerCenter.model.service.CustomerCenterService;

@WebServlet("/notice/select/detail")
public class NoticeSelectDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminPostNo = Integer.parseInt(request.getParameter("no"));
		System.out.println("adminPostNo 확인확인333" + adminPostNo);
		int categoryNo = 1;
		
		Map<String, Integer> info = new HashMap<String, Integer>();
		info.put("adminPostNo", adminPostNo);
		info.put("categoryNo", categoryNo);
		
		AdminPostAndEmployeeDTO admin = new CustomerCenterService().selectDetailNotice(info);
		
		request.setAttribute("adminList", admin);
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/noticeDetail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
