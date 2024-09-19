package com.xworks.interf.rules.repository;

public class VehicleRepositoryImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("save in VehicleRepositoryImpl ");
	}

	@Override
	public void update() {
		System.out.println("update in VehicleRepositoryImpl ");

	}

	@Override
	public boolean delete() {
		System.out.println("delete in VehicleRepositoryImpl ");
		return true;
	}

	@Override
	public String read() {
		System.out.println("read in VehicleRepositoryImpl ");
		return "vehicle type";
	}

}
