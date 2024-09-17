package com.xworks.interf.impliments;

import com.xworks.interf.rules.HospitalRule;

public class Bag extends Ruler implements HospitalRule {

	//a class can inherit a class and implements a interface
	
	@Override
	public boolean smoking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String visitingTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfOuters() {
		// TODO Auto-generated method stub
		return 0;
	}

}
