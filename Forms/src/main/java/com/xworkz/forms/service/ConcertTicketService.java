package com.xworkz.forms.service;

import com.xworkz.forms.dto.ConcertTicketDTO;

public interface ConcertTicketService {
	
	boolean validateAndSave(ConcertTicketDTO concertTicketDTO);

}
