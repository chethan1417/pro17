package com.xworks.naganna.runner;

import com.xworks.naganna.CentralGovernment;
import com.xworks.naganna.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
	
		StateGovernment stategovernment= new StateGovernment("Karnataka", 224, "siddu", "kiran ambal");
		stategovernment.display(); 
		System.out.println("---------------");
		
		StateGovernment stategovernment1= new StateGovernment("Kerala", 140, "Pinarayi Vijayan", "EP. Jayarajan");
		stategovernment1.display();
		System.out.println("----------------");
		
		CentralGovernment centralgovernment= new CentralGovernment("Andhra Pradesh", 175);
		centralgovernment.display();
		System.out.println("----------------");
		
		CentralGovernment centralgovernment1= new CentralGovernment("TN", 236);
		centralgovernment1.display();
		
	}



	

}
