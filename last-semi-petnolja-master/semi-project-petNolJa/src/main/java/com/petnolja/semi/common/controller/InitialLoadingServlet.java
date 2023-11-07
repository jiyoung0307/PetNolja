package com.petnolja.semi.common.controller;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.petnolja.semi.common.config.ConfigLocation;

@WebServlet(urlPatterns = {}, loadOnStartup = 1)
public class InitialLoadingServlet extends HttpServlet {
	private static final long serialVersionUID = -8861487132194833777L;

	@Override
	public void init(ServletConfig config) {
		
		ConfigLocation.mybatisConfigLocation = config.getServletContext().getInitParameter("mybatis-config-location");
		
		System.out.println(ConfigLocation.mybatisConfigLocation);
	}
}
