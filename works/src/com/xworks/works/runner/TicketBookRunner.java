package com.xworks.works.runner;

import com.xworks.works.inter.SeatType;
import com.xworks.works.inter.TicketType;
import com.xworks.works.inter.dto.TicketBookDTO;

public class TicketBookRunner {

	public static void main(String[] args) {

		TicketBookDTO tick=new TicketBookDTO();
		tick.setMovieName("martin");
		tick.setTheaterName("prasanna");
		tick.setSeatType(SeatType.RECLINER);
		tick.setTicketType(TicketType.ONLINE);
		
		System.out.println(tick.getMovieName());
		System.out.println(tick.getTheaterName());
		System.out.println(tick.getSeatType().getSeatNo());
		System.out.println(tick.getTicketType().getCost());


	}

}
