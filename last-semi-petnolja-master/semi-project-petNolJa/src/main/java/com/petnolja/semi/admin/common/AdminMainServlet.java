package com.petnolja.semi.admin.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.AdminLogDTO;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.MemberLogService;

@WebServlet("/admin/main")
public class AdminMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberLogService memberLogService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		List<AdminLogDTO> adminLogDTO = new AdminLogInService().selectAdminLoginLog();
//		
		
//		request.setAttribute("adminLogDTO", adminLogDTO);
		memberLogService = new MemberLogService();
		String path = "/WEB-INF/views/main/admin-main.jsp";
		HttpSession httpSession = request.getSession();
		System.out.println("잘 담겨있나 EmpId? " + (httpSession.getAttribute("loginMember")));
//		int empId =((EmployeeDTO)httpSession.getAttribute("loginMember")).getEmpId();
		int empId =((EmployeeDTO)(httpSession.getAttribute("loginMember"))).getEmpId();
		System.out.println("Controller empId: " + empId);
		
		List<AdminLogDTO> empLogList = memberLogService.empLog(empId);
		System.out.println("adminMainServlet empLogList: " + empLogList);
		request.setAttribute("empLogList", empLogList);
		System.out.println("empLogList: " + empLogList);
		request.getRequestDispatcher(path).forward(request, response);
//		request.getRequestDispatcher("/WEB-INF/views/main/admin-main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
