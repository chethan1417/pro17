package com.xworkz.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;

@WebServlet(loadOnStartup = 1, urlPatterns = "/go")
public class OrderFoodServlet extends HttpServlet {

	public OrderFoodServlet() {

		System.out.println("OrderFoodServlet is running");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String foodName=req.getParameter("foodName");
		String quantity=req.getParameter("quantity");
		String price=req.getParameter("price");
		
		System.out.println("Food Name:"+foodName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);

		boolean valid=true;
		PrintWriter writer=resp.getWriter();

		writer.write("<html>");
		writer.write("<body>");
		
		if(quantity!=null)
		{
			int convertedQuantity=Integer.valueOf(quantity);
			if(convertedQuantity>0)
			{
				System.out.println("Given Quantity is valid");
			}
			else
			{
				valid=false;
				System.out.println("Given Quantity is In-valid");	
				writer.println("<h1> Given Quantity is In-valid</h1>");
			}
		}
		
		if(price!=null)
		{
			double convertedPrice=Double.valueOf(price);
			if(convertedPrice>29)
			{
				System.out.println("Given Price is valid");
			}
			else
			{
				valid=false;
				System.out.println("Given Price is In-valid");
				writer.println("<h1> Given Price is In-valid </h1>");
			}
		}
		if(valid)
		{
			writer.println("<h1>Order is Success</h1>");
		}
		else
		{
			writer.println("<h1>Order is Not Success</h1>");
		}
		
		
		writer.write("</body>");
		writer.write("</html>");


	}

}
