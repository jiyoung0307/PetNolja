package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.customerCenter.model.service.CustomerCenterService;

@WebServlet("/notice/insert")
public class NoticeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/noticeInsert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int categoryNo = 1;
		int empId = ((EmployeeDTO)session.getAttribute("loginMember")).getEmpId();
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		AdminPostDTO adminPost = new AdminPostDTO();
		adminPost.setAdminCategoryNo(categoryNo);
		adminPost.setEmpId(empId);
		adminPost.setAdminpostTitle(title);
		adminPost.setAdminpostContents(contents);
		
		int result = new CustomerCenterService().inserAdminPost(adminPost);
		
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
