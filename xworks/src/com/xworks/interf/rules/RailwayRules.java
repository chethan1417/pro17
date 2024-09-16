package com.xworks.interf.rules;

public interface RailwayRules {

	boolean platformTicket();

	boolean onlineTicket();

	boolean stationMasterAvailable();

	boolean policeStation();

	boolean toiletFacility();

	boolean queSystem();

	boolean foodAvailable();

	boolean silence();

	boolean smoking();

	int noOfPlatforms();

	int noOfTicketCounters();

	boolean displayBoard();

	boolean ticketCancellation();

	boolean interStateTrains();

	int noOfRooms();

}
