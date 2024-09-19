package com.xworks.works.inter.service;

import com.xworks.works.inter.repsoitory.Repository;

public class ServiceImpl implements Service {

	private Repository repository;

	public ServiceImpl(Repository repository) {
		this.repository = repository;
	}

	@Override
	public String push() {
		System.out.println("push in ServiceImpl");
		if (repository != null) {
			boolean saved = repository.save();
			if (saved) {
				System.out.println("saved successfully");
				return "Success";
			} else {
				System.out.println("not saved ");
				return "failed";

			}
		} else {
			System.out.println("repository is null");
		}
		return "issue";
	}

}
