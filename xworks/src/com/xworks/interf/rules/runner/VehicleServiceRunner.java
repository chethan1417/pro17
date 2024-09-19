package com.xworks.interf.rules.runner;

import com.xworks.interf.rules.repository.VehicleRepository;
import com.xworks.interf.rules.repository.VehicleRepositoryImpl;
import com.xworks.interf.rules.service.VehicleService;
import com.xworks.interf.rules.service.VehicleServiceImpl;

public class VehicleServiceRunner {

	public static void main(String[] args) {

		VehicleRepository vehicle = new VehicleRepositoryImpl();
		VehicleService service = new VehicleServiceImpl(vehicle);
		System.out.println();
		
		boolean a1=service.clear();
		System.out.println(a1);
		System.out.println();
		
		service.merge();
		System.out.println();
		
		service.persist();
		System.out.println();
		
		String a2=service.search();
		System.out.println(a2);
	}

}
