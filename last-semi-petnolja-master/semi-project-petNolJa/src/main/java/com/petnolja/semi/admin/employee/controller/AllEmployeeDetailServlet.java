package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.AllEmployeeDetailService;

@WebServlet("/allEmployeeDetail")
public class AllEmployeeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AllEmployeeDetailService allEmployeeDetailService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		allEmployeeDetailService = new AllEmployeeDetailService();
		String path = "/WEB-INF/views/admin/employee/AllempDetail.jsp";
		
		String empId = request.getParameter("empNo");
		System.out.println("empNo: " + empId);
		
		EmployeeDTO empDTO = allEmployeeDetailService.allEmployeeDetail(empId);
		System.out.println("empDTO: " + empDTO);
		request.setAttribute("empDTO", empDTO);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
