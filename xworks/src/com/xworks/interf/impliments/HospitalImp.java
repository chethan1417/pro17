package com.xworks.interf.impliments;

import com.xworks.interf.rules.HospitalRule;

public class HospitalImp implements HospitalRule {

	@Override
	public boolean smoking() {
		System.out.println("created smoking in HospitalInterface");
		return false;
	}

	@Override
	public String visitingTime() {
		System.out.println("created visitingTime in  HospitalInterface");
		return "10Am to 10PM";
	}

	@Override
	public int noOfOuters() {
		System.out.println("created noOfOuters in HospitalInterface ");
		return 0;
	}

}
