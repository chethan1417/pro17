package com.xworks.works.inter.dto;

import com.xworks.works.inter.SeatType;
import com.xworks.works.inter.TicketType;

public class TicketBookDTO {
	
	private String movieName;
	private String theaterName;
	private TicketType ticketType;
	private SeatType seatType;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	
	

	


}
