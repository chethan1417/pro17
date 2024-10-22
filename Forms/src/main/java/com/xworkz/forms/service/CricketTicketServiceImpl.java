package com.xworkz.forms.service;

import com.xworkz.forms.dto.CricketTicketDTO;

public class CricketTicketServiceImpl implements CricketTicketService {

	@Override
	public boolean validateAndSave(CricketTicketDTO cricketTicketDTO) {

		if (cricketTicketDTO != null) {
			String groundName = cricketTicketDTO.getGroundName();
			if (groundName != null && !groundName.isEmpty() && groundName.length() >= 4 && groundName.length() <= 50) {
				System.out.println("Ground Name is valid");
			} else {
				System.out.println("Ground Name is Invalid");
			}

			String customerName = cricketTicketDTO.getCustomerName();
			if (customerName.length() >= 4 && customerName.length() <= 40 && customerName != null) {
				System.out.println("Customer name is valid");
			} else {
				System.out.println("Customer name is Invalid");
			}

			String customerEmail = cricketTicketDTO.getCustomerEmail();
			if (customerEmail != null && !customerEmail.isEmpty() && customerEmail.contains("@")
					&& (customerEmail.endsWith(".com") || customerEmail.endsWith(".in"))) {
				System.out.println("Given email is valid....");
			} else {
				System.err.println("Given email is Invalid....");
			}

			int numberOfTickets = cricketTicketDTO.getNumberOfTickets();
			if (numberOfTickets >= 1) {
				System.out.println("number Of Tickets is valid");
			} else {
				System.err.println("number Of Tickets is invalid");
			}

		}

		return false;
	}

}
