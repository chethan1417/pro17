package com.xworkz.forms.service;

import com.xworkz.forms.dto.ConcertTicketDTO;

public class ConcertTicketServiceImpl implements ConcertTicketService {

	@Override
	public boolean validateAndSave(ConcertTicketDTO concertTicketDTO) {

		if (concertTicketDTO != null) {
			boolean valid = true;

			String location = concertTicketDTO.getLocation();
			if (location != null && !location.isEmpty() && location.length() >= 5 && location.length() <= 50) {
				System.out.println("Location is valid");
			} else {
				System.err.println("Location is invalid");
				valid = false;
			}

			String artistName = concertTicketDTO.getArtistName();
			if (artistName != null && !artistName.isEmpty() && artistName.length() >= 4 && artistName.length() <= 30) {
				System.out.println("Artist name is valid ");
			} else {
				System.err.println("Artist name is invalid");
				valid = false;

			}

			int noOfTickets = concertTicketDTO.getNoOfTickets();
			if (noOfTickets >= 1) {
				System.out.println("No of tickets is valid");
			} else {
				System.out.println("No of tickets is Invalid");
				valid = false;
			}

		}

		return false;
	}

}
