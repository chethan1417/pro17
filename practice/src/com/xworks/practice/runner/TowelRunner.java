package com.xworks.practice.runner;

import com.xworks.practice.assign.CottonTowel;

public class TowelRunner {

	public static void main(String[] args) {
		
		CottonTowel towel=new CottonTowel();
		towel.wash();
		towel.wash(2);
		//here compiler already checked the methods over ridden or loaded because of over loading the 
		//jvm will get that which method or const.. is  to be achived so it can be called ad run time poly.. 

	}

}
