package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.AdminLogInService;

@WebServlet("/member/admin/change")
public class AdminPwdChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/employee/adminChangePwd.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		EmployeeDTO emp = (EmployeeDTO)session.getAttribute("loginMember");
		
		String empPwd = request.getParameter("empPwd");
		String empId = String.valueOf(emp.getEmpId());
		Map<String, String> empMap = new HashMap<String, String>();
		empMap.put("empId", empId);
		empMap.put("empPwd", empPwd);
//		System.out.println("empMap: " + empMap);
		int result = new AdminLogInService().updateEmpPwd(empMap);
		
		
		if(result > 0) {
			emp.setPassword(empPwd);
			session.setAttribute("loginMember", emp);
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('비밀번호 변경이 완료되었습니다.'); location.href='../../admin/main';</script>"); 
			out.flush();
			out.close();
		} else {
			request.getRequestDispatcher("/WEB-INF/views/common/adminFailedPage.jsp").forward(request, response);
		}
		
	}

}
