package com.xworkz.forms.service;

import com.xworkz.forms.dto.MovieTicketsDTO;

public class MovieTicketsServiceImpl implements MovieTicketsService {

	@Override
	public boolean validate(MovieTicketsDTO movieTicketsDTO) {

		if(movieTicketsDTO!=null)
		{
			String name = movieTicketsDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
				System.out.println("Given name is valid....");
			} else {
				System.err.println("Given name is invalid");
			}
			
			int totalTickets = movieTicketsDTO.getTotalTickets();
			if (totalTickets >=1) {
				System.out.println("total Tickets is valid");
			} else {
				System.err.println("total Tickets is invalid");
			}

			String theaterName = movieTicketsDTO.getTheaterName();
			if (theaterName != null && !theaterName.isEmpty() && theaterName.length() >= 3 && theaterName.length() <= 30) {
				System.out.println("Given Theater name is valid....");
			} else {
				System.err.println("Given Theater name is invalid");
			}
			
			double donation = movieTicketsDTO.getDonation();
			if (donation>=1) {
				System.out.println("donation is valid");
			} else {
				System.err.println("donation is invalid");
			}

			String date = movieTicketsDTO.getDate();
			if (date != null && !date.isEmpty()) {
				System.out.println("Given name is valid....");
			} else {
				System.err.println("Given name is invalid");
			}	
			
			String time = movieTicketsDTO.getName();
			if (time != null && !time.isEmpty()) {
				System.out.println("Given time is valid....");
			} else {
				System.err.println("Given time is invalid");
			}		
		}
		
		return false;
	}

}
