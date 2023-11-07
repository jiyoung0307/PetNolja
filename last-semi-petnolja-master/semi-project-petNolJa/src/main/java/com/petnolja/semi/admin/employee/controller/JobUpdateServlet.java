package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.JobDTO;
import com.petnolja.semi.admin.employee.model.service.JobService;

@WebServlet("/admin/job/update")
public class JobUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/employee/jobUpdatete.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jobName = request.getParameter("jobName");
		String jobYn = request.getParameter("jobYn");
		
		JobDTO job = new JobDTO();
		job.setJobName(jobName);
		job.setJobYn(jobYn);

//		System.out.println(job);
		
		JobService jobService = new JobService();
		int result = jobService.jobUpdate(job);
		
		String path="";
		if(result > 0) {
			path="/WEB-INF/views/admin/employee/jobModifyConfirm.jsp";
			request.setAttribute("successCode", "updateJob");
		} else {
			path="/WEB-INF/views/common/adminFailedPage.jsp";
			request.setAttribute("message", "직책 수정에 실패하였습니다");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
