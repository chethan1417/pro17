package com.xworks.datatypes;

import com.xworks.datatypes.things.Hat;
import com.xworks.datatypes.things.RajKumar;
import com.xworks.datatypes.things.Upendra;
import com.xworks.datatypes.things.Yash;

public class HatRunner {

	public static void main(String[] args) {

		Upendra upendra = new Upendra();
		upendra.wear();
		
		
		Yash yash = new Yash();
		Hat hat = new Hat();
		yash.tear(hat);
		
		RajKumar rajkumar = new RajKumar();
		Hat hat2=new Hat();
		rajkumar.hat=hat2;
		rajkumar.fold();
		

	}

}
