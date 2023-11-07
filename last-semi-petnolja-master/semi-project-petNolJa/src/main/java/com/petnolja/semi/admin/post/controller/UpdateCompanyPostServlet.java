package com.petnolja.semi.admin.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.CompanyPostDTO;
import com.petnolja.semi.admin.post.model.service.UpdateCompanyPostService;

@WebServlet("/UpdateCompanyPost")
public class UpdateCompanyPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UpdateCompanyPostService updateCompanyPostService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/post/UpdateCompanyIntro.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelPostLtitle = request.getParameter("hotelPostLtitle");
		String hotelPostContentsFirst = request.getParameter("hotelPostContentsFirst");
		String hotelPostContentsTwo = request.getParameter("hotelPostContentsTwo");
		String hotelPostContentsThird = request.getParameter("hotelPostContentsThird");
//		int locationPostNo = 1;
		String path = "";
		System.out.println(hotelPostLtitle);
		System.out.println(hotelPostContentsFirst);
		System.out.println(hotelPostContentsTwo);
		System.out.println(hotelPostContentsThird);
		
		CompanyPostDTO companyPostDTO = new CompanyPostDTO();
		
		companyPostDTO.setHotelPostLtitle(hotelPostLtitle);
		companyPostDTO.setHotelPostContentsFirst(hotelPostContentsFirst);
		companyPostDTO.setHotelPostContentsTwo(hotelPostContentsTwo);
		companyPostDTO.setHotelPostContentsThird(hotelPostContentsThird);
		
		updateCompanyPostService = new UpdateCompanyPostService();
		int result = updateCompanyPostService.updateCompanyPost(companyPostDTO);
		
		if(result > 0) {
			path = "adminSuccessPage";
			
		} else {
			path="adminFailedPage";
		}
		response.sendRedirect(path);
	}
}
