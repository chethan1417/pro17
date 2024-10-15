package com.xworkz.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup =1,urlPatterns = "/order")

public class OrderServlet extends HttpServlet {
	
	public OrderServlet() {
		System.out.println("OrderServlet is running");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("service in OrderServlet");
		String customerName=req.getParameter("customerName");
		String item=req.getParameter("item");
		String quantity=req.getParameter("quantity");
		
		System.out.println("Customer Name:"+customerName);
		System.out.println("Item:"+item);
		System.out.println("Quantity:"+quantity);
		System.out.println();
		
		resp.getWriter().write("Order is success");


	}

}
