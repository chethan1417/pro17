package com.xworks.interf.impliments;

import com.xworks.interf.rules.TempleRule;

public class TempleImp implements TempleRule {

	@Override
	public boolean silence() {
		System.out.println("created silence in TempleImp");
		return true;
	}

	@Override
	public boolean cleanliness() {
		System.out.println("created cleanliness in TempleImp");
		return true;
	}

	@Override
	public boolean gentleness() {
		System.out.println("created gentleness in TempleImp");
		return true;
	}

	@Override
	public int openingtime() {
		System.out.println("created openingtime in TempleImp");
		return 0;
	}

	@Override
	public int closingTime() {
		System.out.println("created closingTime in TempleImp");
		return 0;
	}

	@Override
	public boolean sundaysOpen() {
		System.out.println("created sundaysOpen in TempleImp");
		return false;
	}

	@Override
	public boolean dresscode() {
		System.out.println("created dresscode in TempleImp");
		return false;
	}

	@Override
	public boolean phonesAllowed() {
		System.out.println("created phonesAllowed in TempleImp");
		return false;
	}

	@Override
	public boolean cameraAllowed() {
		System.out.println("created cameraAllowed in TempleImp");
		return false;
	}

	@Override
	public boolean queSystem() {
		System.out.println("created queSystem in TempleImp");
		return true;
	}

}
