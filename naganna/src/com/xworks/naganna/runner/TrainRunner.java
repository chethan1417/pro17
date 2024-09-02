package com.xworks.naganna.runner;

import com.xworks.naganna.MetroTrain;
import com.xworks.naganna.SubUrbanTrain;

public class TrainRunner {

	public static void main(String[] args) {
		
		MetroTrain metrotrain= new MetroTrain(62309, "Ksr ", "Cta");
		metrotrain.display();
		System.out.println("_");
		
		MetroTrain metrotrain1= new MetroTrain(62309, "gadag", "dvg");
		metrotrain1.display();
		System.out.println("_");
		
		SubUrbanTrain suburbantrain= new SubUrbanTrain(626701, "shivmogga");
		suburbantrain.display();
		System.out.println("_");
		
		SubUrbanTrain suburbantrain1= new SubUrbanTrain(62708, "dharmastala");
		suburbantrain1.display();
		
		

		
		
	}



	

}
