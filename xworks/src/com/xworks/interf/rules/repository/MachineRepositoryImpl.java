
package com.xworks.interf.rules.repository;

public class MachineRepositoryImpl implements MachineRepository {

	@Override
	public void save() {
		System.out.println("save in MachineRepositoryImpl");
	}

	@Override
	public int update() {
		System.out.println("update in MachineRepositoryImpl");
		return 1;
	}

	@Override
	public int delete() {
		System.out.println("delete in MachineRepositoryImpl");
		return 2;
	}

	@Override
	public int read() {
		System.out.println("read in MachineRepositoryImpl");
		return 3;
	}

}
