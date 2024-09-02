package com.xworks.naganna.runner;

import com.xworks.naganna.OnlineMarket;
import com.xworks.naganna.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		SuperMarket supermarket= new SuperMarket("Kr Market", "Chickpet", "Vegtable", "All");
		supermarket.show();
		System.out.println("--------------------");
		SuperMarket supermarket1= new SuperMarket("SG Market", " MG Rd", "food", "All");
		supermarket1.show();
		System.out.println("--------------------");
		
		OnlineMarket onlinemarket= new OnlineMarket("Cloths");
		onlinemarket.show();
		System.out.println("--------------------");
		
		OnlineMarket onlinemarket1= new OnlineMarket("Fruits");
		onlinemarket1.show();
		
	}


	

}
