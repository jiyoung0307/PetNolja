package com.petnolja.semi.admin.customerCenter.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.AdminPostAndEmployeeDTO;
import com.petnolja.semi.admin.customerCenter.model.service.CustomerCenterService;

@WebServlet("/faq/select")
public class FaqSelectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* FAQ 목록 조회 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int categoryNo = 2;
		List<AdminPostAndEmployeeDTO> faqList = new CustomerCenterService().selectAllAdminPost(categoryNo);
		
		request.setAttribute("faqList", faqList);
		request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/faqList.jsp").forward(request, response);
	}
	
	/* FAQ 수정 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminPostNo = Integer.valueOf(request.getParameter("faqNo"));
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		System.out.println("faq 수정 번호: " + adminPostNo);
		
		AdminPostAndEmployeeDTO notice = new AdminPostAndEmployeeDTO();
		notice.setAdminpostNo(adminPostNo);
		notice.setAdminpostTitle(title);
		notice.setAdminpostContents(contents);
		
		int result = new CustomerCenterService().UpdateAdminPost(notice);
		
		if(result > 0) {
			request.getRequestDispatcher("/WEB-INF/views/admin/customerCenter/faqModify.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/adminFailedPage.jsp").forward(request, response);
		}
	}

}
