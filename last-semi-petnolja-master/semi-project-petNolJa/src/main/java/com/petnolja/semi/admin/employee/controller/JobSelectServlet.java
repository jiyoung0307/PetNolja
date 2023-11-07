package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.JobDTO;
import com.petnolja.semi.admin.employee.model.service.JobService;

@WebServlet("/admin/job/select")
public class JobSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<JobDTO> jobList = new JobService().selectJob();
		
		for(JobDTO board : jobList) {
			System.out.println(board);
		}
		
		String path="";
		if(jobList != null) {
			path="/WEB-INF/views/admin/employee/jobSelect.jsp";
			request.setAttribute("jobList", jobList);
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "직책을 조회할 수 없습니다!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
