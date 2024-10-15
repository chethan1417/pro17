package com.xworkz.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup =1,urlPatterns = "/search")

public class SearchServlet extends HttpServlet{

	public SearchServlet() {

		System.out.println("SearchServlet is running");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service in SearchServlet");
		String email=req.getParameter("email");
		System.out.println("Email:"+email);
		System.out.println();
		
		resp.getWriter().write("search is success");
	}
}
