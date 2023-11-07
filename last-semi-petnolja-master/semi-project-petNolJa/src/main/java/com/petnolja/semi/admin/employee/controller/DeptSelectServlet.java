package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.DeptDTO;
import com.petnolja.semi.admin.employee.model.service.DeptService;

@WebServlet("/admin/dept/select")
public class DeptSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<DeptDTO> deptList = new DeptService().selectDept();
		
		for(DeptDTO board : deptList) {
			System.out.println(board);
		}

		String path="";
		if(deptList != null) {
			path="/WEB-INF/views/admin/employee/deptSelect.jsp";
			request.setAttribute("deptList", deptList);
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "부서 조회에 실패하였습니다.");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}
