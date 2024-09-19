package com.xworks.interf.rules.repository;

public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("save in AddressRepositoryImpl");
		return true;
	}

	@Override
	public int update() {
		System.out.println("update in AddressRepositoryImpl");
		return 5;
	}

	@Override
	public void delete() {
		System.out.println("delete in AddressRepositoryImpl");

	}

	@Override
	public String read() {
		System.out.println("read in AddressRepositoryImpl");
		return "street name";
	}

}
