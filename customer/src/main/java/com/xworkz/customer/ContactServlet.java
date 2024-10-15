package com.xworkz.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup =1,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet{
	
	public ContactServlet() {

		System.out.println("ContactServlet is running");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service in ContactServlet");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String age=req.getParameter("age");
		String address=req.getParameter("address");
		
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Mobile:"+mobile);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println();

		resp.getWriter().write("Contact is success");
	}

}
