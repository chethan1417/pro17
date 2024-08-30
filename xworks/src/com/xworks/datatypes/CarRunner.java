package com.xworks.datatypes;

import com.xworks.datatypes.things.Alok;
import com.xworks.datatypes.things.Car;
import com.xworks.datatypes.things.Chandan;
import com.xworks.datatypes.things.Varun;
import com.xworks.datatypes.things.Yashu;

public class CarRunner {

	public static void main(String[] args) {
		
		Varun varun=new Varun();
		varun.wash();
		
		Chandan chandan=new Chandan();
		Car car=new Car("mahindra","Xuv700",7);
		chandan.service(car);
		
		Alok alok=new Alok();
		Car car1=new Car("volks","polo",5);
		alok.car=car1;
		car1.drive();
		car1.torsu();
		
		Yashu yashu=new Yashu();
		yashu.sell();
		
	}

}
