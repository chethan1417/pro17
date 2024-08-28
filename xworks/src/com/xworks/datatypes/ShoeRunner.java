package com.xworks.datatypes;

import com.xworks.datatypes.things.Divya;
import com.xworks.datatypes.things.Harshita;
import com.xworks.datatypes.things.Omkar;
import com.xworks.datatypes.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Divya divya=new Divya();
		divya.wear();
		
		Omkar omkar = new Omkar();
		Shoe shoe=new Shoe();
		omkar.snikers(shoe);
		
		
		Harshita harshita=new Harshita();
		Shoe shoe1=new Shoe();
		harshita.shoe=shoe1;
		harshita.formals();

	}

}
