package com.xworks.interf.rules.service;

import com.xworks.interf.rules.repository.AddressRepository;

public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
		System.out.println("AddressRepository const.. in AddressServiceImpl ");
	}

	@Override
	public boolean push() {
		System.out.println("push in AddressServiceImpl");
		if (addressRepository != null) {
			boolean add = addressRepository.save();
			if (add) {
				System.out.println("success");
				return true;
			} else {
				System.out.println("failure");
				return false;

			}
		} else {
			System.out.println("addressRepository is null");
		}
		return false;
	}

	@Override
	public int refresh() {
		System.out.println("refresh in AddressServiceImpl");
		if (addressRepository != null) {
			int add1 = addressRepository.update();
			if (add1 > 4) {
				System.out.println("success");
				System.out.println("success number:" + add1);
			} else {
				System.out.println("failure");
				System.out.println("failure number:" + add1);

			}
		} else {
			System.out.println("addressRepository is null");
		}
		return 0;
	}

	@Override
	public void remove() {
		System.out.println("remove in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			addressRepository.delete();
		} else {
			System.out.println("addressRepository is  null");

		}

	}

	@Override
	public String load() {
		System.out.println("load in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			addressRepository.read();
			return "success";
		} else {
			System.out.println("addressRepository is  null");
			return "failure";

		}
	}

}
