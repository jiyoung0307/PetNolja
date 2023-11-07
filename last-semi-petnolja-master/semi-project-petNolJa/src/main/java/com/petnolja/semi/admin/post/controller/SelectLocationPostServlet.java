package com.petnolja.semi.admin.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.LocationPostDTO;
import com.petnolja.semi.admin.post.model.service.SelectLocationIntroForAdminService;


@WebServlet("/SelectLocationPost")
public class SelectLocationPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private SelectLocationIntroForAdminService selectLocationIntroForAdminService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	selectLocationIntroForAdminService = new SelectLocationIntroForAdminService();
	
	LocationPostDTO locationPostdto = selectLocationIntroForAdminService.LocationIntro();
	
	System.out.println(locationPostdto);
	request.setAttribute("locationPostdto", locationPostdto);
	
	request.getRequestDispatcher("/WEB-INF/views/admin/post/SelectForAdminLocationIntro.jsp").forward(request, response);
	
	}


}
