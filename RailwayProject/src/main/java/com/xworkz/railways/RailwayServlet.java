package com.xworkz.railways;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/railways")

public class RailwayServlet extends HttpServlet {

	public RailwayServlet() {

		System.out.println("RailwayServlet is running");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		String startDate = req.getParameter("start Date");
		String returnDate = req.getParameter("return Date");
		String seatType = req.getParameter("seat Type");
		String totalTickets = req.getParameter("total Tickets");
		String noOfMale = req.getParameter("no Of Male");
		String noOfFemale = req.getParameter("no Of Female");


		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();

		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("</body>");
		printWriter.println("<h2> Name: " + req.getParameter("name"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Source: " + req.getParameter("source"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Destination: " + req.getParameter("destination"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Start Date: " + req.getParameter("startDate"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Return Date: " + req.getParameter("returnDate"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Seat Type: " + req.getParameter("seatType"));
		printWriter.println("</h2>");
		printWriter.println("<h2> Total Ticket: " + req.getParameter("totalTickets"));
		printWriter.println("</h2>");
		printWriter.println("<h2> No of Male: " + req.getParameter("noOfMale"));
		printWriter.println("</h2>");
		printWriter.println("<h2> No of Female: " + req.getParameter("noOfFemale"));
		printWriter.println("</h2>");
		printWriter.println("</htSml>");

	}
}
