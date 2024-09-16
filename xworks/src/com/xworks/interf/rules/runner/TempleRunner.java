package com.xworks.interf.rules.runner;

import com.xworks.interf.impliments.TempleImp;

public class TempleRunner {

	public static void main(String[] args) {

		TempleImp temple = new TempleImp();
		System.out.println(temple.cameraAllowed());
		System.out.println(temple.cleanliness());
		System.out.println(temple.closingTime());
		System.out.println(temple.dresscode());
		System.out.println(temple.gentleness());
		System.out.println(temple.openingtime());
		System.out.println(temple.phonesAllowed());
		System.out.println(temple.queSystem());
		System.out.println(temple.silence());
		System.out.println(temple.sundaysOpen());

	}

}
