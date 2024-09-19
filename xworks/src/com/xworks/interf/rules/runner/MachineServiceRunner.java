package com.xworks.interf.rules.runner;

import com.xworks.interf.rules.repository.MachineRepository;
import com.xworks.interf.rules.repository.MachineRepositoryImpl;
import com.xworks.interf.rules.service.MachineService;
import com.xworks.interf.rules.service.MachineServiceImpl;

public class MachineServiceRunner {

	public static void main(String[] args) {

		MachineRepository machine = new MachineRepositoryImpl();
		MachineService service = new MachineServiceImpl(machine);
		System.out.println();

		service.save();
		System.out.println();

		int a = service.delete();
		System.out.println(a);
		System.out.println();

		int b = service.read();
		System.out.println(b);
		System.out.println();

		int c = service.update();
		System.out.println(c);
	}

}
