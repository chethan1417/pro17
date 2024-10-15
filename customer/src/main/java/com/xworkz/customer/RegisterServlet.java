package com.xworkz.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup =1,urlPatterns = "/register")

public class RegisterServlet extends HttpServlet {
	
	public RegisterServlet() {

		System.out.println("RegisterServlet is running");
	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service in RegisterServlet ");
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		String state=req.getParameter("state");
		String city=req.getParameter("city");

		System.out.println("First Name:"+firstName);
		System.out.println("Last Name:"+lastName);
		System.out.println("Email:"+email);
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+password);
		System.out.println("Confirm password:"+confirmPassword);
		System.out.println("Gender:"+gender);
		System.out.println("Country:"+country);
		System.out.println("State:"+state);
		System.out.println("City:"+city);
		System.out.println();

		resp.getWriter().write("Register is success");
	}
}
