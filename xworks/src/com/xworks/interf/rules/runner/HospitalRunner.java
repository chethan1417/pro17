package com.xworks.interf.rules.runner;

import com.xworks.interf.impliments.HospitalImp;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalImp hosp = new HospitalImp();

		System.out.println(hosp.smoking());
		System.out.println(hosp.noOfOuters());
		System.out.println(hosp.visitingTime());
	}

}
