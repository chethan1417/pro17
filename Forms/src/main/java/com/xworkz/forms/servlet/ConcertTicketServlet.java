package com.xworkz.forms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.dto.ConcertTicketDTO;

@WebServlet(loadOnStartup = 1,urlPatterns = "/concert")
public class ConcertTicketServlet extends HttpServlet {
	
	public ConcertTicketServlet() {

		System.out.println("no arg const of ConcertTicketServlet ");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		String location=req.getParameter("location");
		String artistName=req.getParameter("artistName");
		String ticketType=req.getParameter("ticketType");
		String noOfTickets=req.getParameter("noOfTickets");
		int convertedNoOfTickets=Integer.valueOf(noOfTickets);


		ConcertTicketDTO concertTicketDTO=new ConcertTicketDTO(location, artistName, ticketType, convertedNoOfTickets);
		System.out.println("ConcertTicketDTO:"+concertTicketDTO);
		resp.getWriter().println(concertTicketDTO);
	}
	
	

}
