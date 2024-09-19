package com.xworks.works.inter.repsoitory;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("save in RepositoryImpl");
		return true;
	}

}
