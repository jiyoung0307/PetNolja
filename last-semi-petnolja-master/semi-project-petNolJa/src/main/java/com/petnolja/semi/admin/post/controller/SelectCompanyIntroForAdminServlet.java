package com.petnolja.semi.admin.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.CompanyPostDTO;
import com.petnolja.semi.admin.post.model.service.SelectCompanyIntroForAdminService;


@WebServlet("/SelectCompanyPost")
public class SelectCompanyIntroForAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private SelectCompanyIntroForAdminService selectCompanyIntroForAdminService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	selectCompanyIntroForAdminService = new SelectCompanyIntroForAdminService();
	
	CompanyPostDTO companyPostdto = selectCompanyIntroForAdminService.CompanyIntro();
	
	System.out.println(companyPostdto);
	request.setAttribute("companyPostdto", companyPostdto);
	
	request.getRequestDispatcher("/WEB-INF/views/admin/post/SelectForAdminCompnayIntro.jsp").forward(request, response);
	
	}


}
