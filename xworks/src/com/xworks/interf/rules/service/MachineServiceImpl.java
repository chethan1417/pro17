
package com.xworks.interf.rules.service;

import com.xworks.interf.rules.repository.MachineRepository;

public class MachineServiceImpl implements MachineService {

	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

	@Override
	public void save() {
		System.out.println("save in MachineServiceImpl");
		if (machineRepository != null) {
			System.out.println("machineRepository is not null");
			machineRepository.save();
		} else {
			System.out.println("machineRepository is  null");

		}
	}

	@Override
	public int update() {
		System.out.println("update in MachineServiceImpl");
		if (machineRepository != null) {
			int add1 = machineRepository.update();
			if (add1 > 1) {
				System.out.println("success");
				System.out.println("success number:" + add1);
			} else {
				System.out.println("failure");
				System.out.println("failure number:" + add1);

			}
		} else {
			System.out.println("machineRepository is null");
		}
		return 0;
	}

	@Override
	public int delete() {
		System.out.println("delete in MachineServiceImpl");
		if (machineRepository != null) {
			int add2 = machineRepository.delete();
			if (add2 > 1) {
				System.out.println("success");
				System.out.println("success number:" + add2);
			} else {
				System.out.println("failure");
				System.out.println("failure number:" + add2);

			}
		} else {
			System.out.println("machineRepository is null");
		}
		return 0;
	}

	@Override
	public int read() {
		System.out.println("read in MachineServiceImpl");
		if (machineRepository != null) {
			int add3 = machineRepository.read();
			if (add3 > 1) {
				System.out.println("success");
				System.out.println("success number:" + add3);
			} else {
				System.out.println("failure");
				System.out.println("failure number:" + add3);

			}
		} else {
			System.out.println("machineRepository is null");
		}
		return 0;
	}

}
