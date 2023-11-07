package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.DeptDTO;
import com.petnolja.semi.admin.employee.model.service.DeptService;

@WebServlet("/admin/dept/insert")
public class DeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/employee/deptInsert.jsp").forward(request, response);
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deptName = request.getParameter("deptName");
		String deptYn = request.getParameter("deptYn");
		
		
		
		DeptDTO dept = new DeptDTO();
		dept.setDeptName(deptName);
		dept.setDeptYn(deptYn);
		
//		System.out.println(dept);
		
		DeptService deptService = new DeptService();
		int result = deptService.deptInsert(dept);
		
		String path="";
		if(result > 0) {
			path="/WEB-INF/views/admin/employee/deptInsertConfirm.jsp";
			request.setAttribute("successCode", "insertDept");
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "부서 등록에 실패하였습니다!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
