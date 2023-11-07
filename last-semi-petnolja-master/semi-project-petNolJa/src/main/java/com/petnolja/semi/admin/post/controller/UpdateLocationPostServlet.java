package com.petnolja.semi.admin.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.LocationPostDTO;
import com.petnolja.semi.admin.post.model.service.UpdateLocationPostService;

@WebServlet("/UpdateLocationPost")
public class UpdateLocationPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UpdateLocationPostService updateLocationPostService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/admin/post/UpdateLocationIntro.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String locationPostLtitle = request.getParameter("locationPostLtitle");
		String locationPostOldPost = request.getParameter("locationPostOldPost");
		String locationPostNewPost = request.getParameter("locationPostNewPost");
		String locationPostTelephoneNumber = request.getParameter("locationPostTelephoneNumber");
		int locationPostNo = 11;
		
		System.out.println(locationPostLtitle);
		System.out.println(locationPostOldPost);
		System.out.println(locationPostNewPost);
		System.out.println(locationPostTelephoneNumber);
		
		LocationPostDTO locationPostDTO = new LocationPostDTO();
		
		locationPostDTO.setLocationPostLtitle(locationPostLtitle);
		locationPostDTO.setLocationOldPost(locationPostOldPost);
		locationPostDTO.setLocationNewPost(locationPostNewPost);
		locationPostDTO.setTelePhoneNumber(locationPostTelephoneNumber);
		locationPostDTO.setLocationPostNo(locationPostNo);
		
		System.out.println(locationPostDTO);
		//=================================================
		
		updateLocationPostService = new UpdateLocationPostService();
		int result = updateLocationPostService.updateLocationPost(locationPostDTO);
		
		String path = "";
		if(result > 0) {
			path = "adminSuccessPage";
			
		} else {
			path= "adminFailedPage";
		}
		response.sendRedirect(path);
	}


}
