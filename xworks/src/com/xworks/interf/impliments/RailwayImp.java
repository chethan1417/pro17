package com.xworks.interf.impliments;

import com.xworks.interf.rules.RailwayRules;

public class RailwayImp implements RailwayRules {

	@Override
	public boolean platformTicket() {
		System.out.println("created platformTicket in RailwayImp");
		return false;
	}

	@Override
	public boolean onlineTicket() {
		System.out.println("created onlineTicket in RailwayImp");
		return false;
	}

	@Override
	public boolean stationMasterAvailable() {
		System.out.println("created stationMasterAvailable in RailwayImp");
		return false;
	}

	@Override
	public boolean policeStation() {
		System.out.println("created policeStation in RailwayImp");
		return false;
	}

	@Override
	public boolean toiletFacility() {
		System.out.println("created toiletFacility in RailwayImp");
		return false;
	}

	@Override
	public boolean queSystem() {
		System.out.println("created queSystem in RailwayImp");
		return false;
	}

	@Override
	public boolean foodAvailable() {
		System.out.println("created foodAvailable in RailwayImp");
		return false;
	}

	@Override
	public boolean silence() {
		System.out.println("created sielence in RailwayImp");
		return false;
	}

	@Override
	public boolean smoking() {
		System.out.println("created smoking in RailwayImp");
		return false;
	}

	@Override
	public int noOfPlatforms() {
		System.out.println("created noOfPlatforms in RailwayImp");
		return 0;
	}

	@Override
	public int noOfTicketCounters() {
		System.out.println("created noOfTicketCounters in RailwayImp");
		return 0;
	}

	@Override
	public boolean displayBoard() {
		System.out.println("created displayBoard in RailwayImp");
		return false;
	}

	@Override
	public boolean ticketCancellation() {
		System.out.println("created ticketCancellation in RailwayImp");
		return false;
	}

	@Override
	public boolean interStateTrains() {
		System.out.println("created interStateTrains in RailwayImp");
		return false;
	}

	@Override
	public int noOfRooms() {
		System.out.println("created noOfRooms in RailwayImp");
		return 0;
	}

}
