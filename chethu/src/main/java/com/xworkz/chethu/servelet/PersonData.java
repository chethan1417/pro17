package com.xworkz.chethu.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")

public class PersonData extends HttpServlet {
	
	public PersonData() {
		System.out.println(" Running a Check Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Executed a service in Check Servlet");
		String ref=arg0.getParameter("employee");
		String ref1=arg0.getParameter("email");
		System.out.println(ref);
		System.out.println(ref1);


	}
	

}


