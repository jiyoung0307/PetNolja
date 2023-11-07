package com.petnolja.semi.member.pet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.pet.model.service.PetService;

@WebServlet("/member/pet/insert")
public class petInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/pet/PetInsert.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String petKind = request.getParameter("petKind");
		String petNumber = request.getParameter("petNumber");
		String petName = request.getParameter("petNumber");
		int petAge = Integer.valueOf(request.getParameter("petAge"));
		int petWeight = Integer.valueOf(request.getParameter("petWeight"));
		String petType = request.getParameter("petType");
		String petSex = request.getParameter("petSex");
		String perioVaccinate = request.getParameter("perioVaccinate");
		String rabiesVaccinate = request.getParameter("rabiesVaccinate");
		String petNeuter = request.getParameter("petNeuter");
		String petCharacter = request.getParameter("petCharacter");
		String petHealth = request.getParameter("petHealth");
		String petEtc = request.getParameter("petEtc");
		
		PetDTO pet = new PetDTO();
		pet.setPetKind(petKind);
		pet.setPetNumber(petNumber);
		pet.setPetName(petName);
		pet.setPetAge(petAge);
		pet.setPetWeight(petWeight);
		pet.setPetType(petType);
		pet.setPetSex(petSex);
		pet.setPerioVaccinate(perioVaccinate);
		pet.setRabiesVaccinate(rabiesVaccinate);
		pet.setPetNeuter(petNeuter);
		pet.setPetCharacter(petCharacter);
		pet.setPetHealth(petHealth);
		pet.setPetEtc(petEtc);
		
//		System.out.println(pet);
		
		PetService petService = new PetService();
		int result = petService.petInsert(pet);
		
		String path="";
		if(result > 0) {
			System.out.println("insert 성공 이후");
			path = "/WEB-INF/views/member/pet/PetInsertConfirm.jsp";
			request.setAttribute("successCode", "insertPet");
		} else {
			path = "/WEB-INF/views/common/memberFaild.jsp";
			request.setAttribute("message", "반려동물 등록에 실패하였습니다!");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
                                                         