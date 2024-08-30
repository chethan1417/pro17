package com.xworks.datatypes;

import com.xworks.datatypes.things.Abhishek;
import com.xworks.datatypes.things.Bhoomika;
import com.xworks.datatypes.things.Lakshmi;
import com.xworks.datatypes.things.Megha;
import com.xworks.datatypes.things.Nayana;
import com.xworks.datatypes.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
	
		Megha megha=new Megha();
		megha.wash();
		Nayana nayana=new Nayana();
		nayana.dries();
		
		Lakshmi lakshmi=new Lakshmi();
		WashingMachine washingMachine=new WashingMachine("godrej","front door",25);
		lakshmi.clean(washingMachine);
		
		Abhishek abhishek=new Abhishek();
		WashingMachine washingMachine1=new WashingMachine("Lg","front door",25);
		abhishek.washingMachine=washingMachine1;
		abhishek.dry();
		
		Bhoomika bhoomika=new Bhoomika();
		bhoomika.cleaning();

	}

}
