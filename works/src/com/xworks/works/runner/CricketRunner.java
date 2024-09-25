package com.xworks.works.runner;

import com.xworks.exception.InvalidName;
import com.xworks.exception.PersonalDetails;
import com.xworks.works.inter.CricketRule;
import com.xworks.works.inter.imp.Bcci;
import com.xworks.works.inter.imp.KACricketRule;

public class CricketRunner {

	public static void main(String[] args) throws InvalidName {

		CricketRule cricketrule=new KACricketRule();
		Bcci bcci=new Bcci();
		bcci.setCricketRule(cricketrule);
		bcci.check();
		
		PersonalDetails person = new PersonalDetails();
		person.save("dth");
	}

}
