package com.xworks.interf.impliments;

import com.xworks.interf.rules.CollegeRules;

public class CollegeImp implements CollegeRules {

	@Override
	public boolean uniform() {
		System.out.println("created uniform in CollegeImp ");
		return true;
	}

	@Override
	public boolean shoes() {
		System.out.println("created shoes in CollegeImp ");
		return true;
	}

	@Override
	public boolean tie() {
		System.out.println("created tie in CollegeImp ");
		return true;
	}

	@Override
	public boolean regular() {
		System.out.println("created regular in CollegeImp ");
		return true;
	}

	@Override
	public boolean mischives() {
		System.out.println("created mischives in CollegeImp ");
		return false;
	}

	@Override
	public int startTime() {
		System.out.println("created startTime in CollegeImp ");
		return 0;
	}

	@Override
	public int closeTime() {
		System.out.println("created closeTime in CollegeImp ");
		return 0;
	}

	@Override
	public boolean homework() {
		System.out.println("created homework in CollegeImp ");
		return true;
	}

	@Override
	public boolean bunking() {
		System.out.println("created bunking in CollegeImp ");
		return false;
	}

	@Override
	public boolean ragging() {
		System.out.println("created ragging in CollegeImp ");
		return false;
	}

}
