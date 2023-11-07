package com.petnolja.semi.admin.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.service.AllEmployeeSelectSearchCriteriaService;

@WebServlet("/allEmployeeSelectSearchCriteria")
public class AllEmployeeSelectSearchCriteriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		private AllEmployeeSelectSearchCriteriaService allEmployeeSelectSearchCriteriaService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		allEmployeeSelectSearchCriteriaService = new AllEmployeeSelectSearchCriteriaService();
		String select = request.getParameter("select");
		String search = request.getParameter("search");
		System.out.println("select: " + select);
		System.out.println("search: " + search);
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("search", search);
		searchMap.put("select", select);
		
		List<EmployeeDTO> searchList = allEmployeeSelectSearchCriteriaService.searchList(searchMap); 
		System.out.println("searchList: " + searchList);
		
		response.setContentType("application/json; charset=UTF-8");
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();
		
		PrintWriter out = response.getWriter();
		out.print(gson.toJson(searchList));
		out.flush();
		out.close();
		
	}

}
