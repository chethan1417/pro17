package com.xworks.datatypes;

import com.xworks.datatypes.things.Bikes;
import com.xworks.datatypes.things.Chethan;
import com.xworks.datatypes.things.Muttu;
import com.xworks.datatypes.things.Sanjan;

public class BikesRunner {

	public static void main(String[] args) {
		
		Chethan chethan=new Chethan();
		chethan.ride();
		
		Muttu muttu =new Muttu();
		 Bikes bikes=new Bikes();
		 muttu.drift(bikes);
		 
		 Sanjan sanjan =new Sanjan();
		 Bikes bikes1=new Bikes();
		 sanjan.bikes=bikes1;
		 sanjan.stoppie();
		 
	}

}
