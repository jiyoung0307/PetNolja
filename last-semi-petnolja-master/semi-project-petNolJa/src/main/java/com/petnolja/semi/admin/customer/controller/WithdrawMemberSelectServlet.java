package com.petnolja.semi.admin.customer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.WithdrawMemberDTO;
import com.petnolja.semi.admin.employee.model.service.withdrawMemberSelectService;

@WebServlet("/withdraw/member/select")
public class WithdrawMemberSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<WithdrawMemberDTO> withdrawMember = new withdrawMemberSelectService().selectwithdrawMember();
		
		for(WithdrawMemberDTO member: withdrawMember) {
			System.out.println(member);
		}
		
		request.setAttribute("withdrawMember", withdrawMember);
		request.getRequestDispatcher("/WEB-INF/views/admin/customer/withdrawMemberSelect.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
