package com.petnolja.semi.admin.sales;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.admin.common.dto.SalesDTO;

@WebServlet("/select/date1")
public class SelectSalesListDatesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paymentDate = request.getParameter("paymentDate"); 
	
	List<SalesDTO> salesList = new SalesSelectService().selectSalesListByDate(paymentDate);
	
	for(SalesDTO board: salesList) {
		System.out.println(board);
		}
	
	String path="";
	if(salesList != null) {
		path = "/WEB-INF/views/admin/sales/SelectSalesList.jsp";
		request.setAttribute("salesList", salesList);
	} else {
		path = "/WEB-INF/views/common/adminFaild.jsp"; //실패 페이지가 관리자에 있나?
		request.setAttribute("message", "조회 실패!");
	}
	request.getRequestDispatcher(path).forward(request, response);
}
	}


