package com.xworks.works.runner;

import com.xworks.works.inter.repsoitory.Repository;
import com.xworks.works.inter.repsoitory.RepositoryImpl;
import com.xworks.works.inter.service.Service;
import com.xworks.works.inter.service.ServiceImpl;

public class ServiceRunner {

	public static void main(String[] args) {

		Repository repository=new RepositoryImpl(); 
		Service service = new ServiceImpl(repository);
		String msg=service.push();
		System.out.println("save status:"+msg);
		
	}

}
