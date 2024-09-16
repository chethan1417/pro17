package com.xworks.interf.rules.runner;

import com.xworks.interf.impliments.RailwayImp;

public class RailwayRunner {

	public static void main(String[] args) {
		RailwayImp rail = new RailwayImp();
		System.out.println(rail.displayBoard());
		System.out.println(rail.foodAvailable());
		System.out.println(rail.interStateTrains());
		System.out.println(rail.noOfPlatforms());
		System.out.println(rail.noOfRooms());
		System.out.println(rail.noOfTicketCounters());
		System.out.println(rail.onlineTicket());
		System.out.println(rail.platformTicket());
		System.out.println(rail.policeStation());
		System.out.println(rail.queSystem());
		System.out.println(rail.silence());
		System.out.println(rail.smoking());
		System.out.println(rail.stationMasterAvailable());
		System.out.println(rail.ticketCancellation());
		System.out.println(rail.toiletFacility());

	}

}
