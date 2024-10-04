package com.xworks.works.runner;

import com.xworks.works.inter.ProductType;
import com.xworks.works.inter.dto.CustomerDTO;

public class CustomerRunner {

	public static void main(String[] args) {
		
		CustomerDTO cust=new CustomerDTO();
		cust.setName("chethan");
		cust.setEmail("chethan@gmail.com");
		cust.setProductType(ProductType.FOOTWARE);
		System.out.println(cust.getName());
		System.out.println(cust.getEmail());
		System.out.println(cust.getProductType());
	}

}
