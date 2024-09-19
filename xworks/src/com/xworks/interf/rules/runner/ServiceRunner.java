package com.xworks.interf.rules.runner;

import com.xworks.interf.rules.repository.AddressRepository;
import com.xworks.interf.rules.repository.AddressRepositoryImpl;
import com.xworks.interf.rules.service.AddressService;
import com.xworks.interf.rules.service.AddressServiceImpl;

public class ServiceRunner {

	public static void main(String[] args) {

		AddressRepository address=new AddressRepositoryImpl();
		AddressService serve=new AddressServiceImpl(address);
		System.out.println();
		
		boolean msg1=serve.push();
		System.out.println(msg1);
		System.out.println();
		
		int msg2=serve.refresh();
		System.out.println(msg2);
		System.out.println();
		
		serve.remove();
		System.out.println();
		
		String msg3=serve.load();
		System.out.println(msg3);
		System.out.println();

	}

}
