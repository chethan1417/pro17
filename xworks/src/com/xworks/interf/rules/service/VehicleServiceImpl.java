package com.xworks.interf.rules.service;

import com.xworks.interf.rules.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {

	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public void persist() {
		System.out.println("persist in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			vehicleRepository.save();
		} else {
			System.out.println("vehicleRepository is  null");

		}
	}

	@Override
	public void merge() {
		System.out.println("merge in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			vehicleRepository.update();
		} else {
			System.out.println("vehicleRepository is  null");

		}

	}

	@Override
	public boolean clear() {
		System.out.println("clear in VehicleServiceImpl");
		if (vehicleRepository != null) {
			boolean add = vehicleRepository.delete();
			if (add) {
				System.out.println("success");
				return true;
			} else {
				System.out.println("failure");
				return false;

			}
		} else {
			System.out.println("vehicleRepository is null");
		}
		return false;

	}

	@Override
	public String search() {
		System.out.println("search in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			vehicleRepository.read();
			return "success";
		} else {
			System.out.println("vehicleRepository is  null");
			return "failure";

		}
	}

}
