package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.AllEmpSelectService;

@WebServlet("/admin/employee/all/select")
public class AllEmployeeSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<EmployeeDTO> allEmployeeList = new AllEmpSelectService().selectAllEmp();
		
		for(EmployeeDTO board : allEmployeeList) {
			System.out.println("allEmployeeList: " + allEmployeeList);
		}
		
		request.setAttribute("allEmployeeList", allEmployeeList);
		
		String path="";
		if(allEmployeeList != null) {
			path = "/WEB-INF/views/admin/employee/AllempSelect.jsp";
			request.setAttribute("allEmployeeList", allEmployeeList);
		} else {
			path = "/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "전체 직원 조회에 실패하였습니다!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}


