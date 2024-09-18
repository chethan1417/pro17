package com.xworks.works.inter.imp;

import com.xworks.works.inter.PGRule;

public class OwnerPGRule {

	private PGRule pgRule;

	public void setPGRule(PGRule pgRule) {
		this.pgRule = pgRule;
	}

	public void check() {
		if (pgRule != null) {
			System.out.println("pgRule is not null");
			pgRule.costPerMonth();
			System.out.println("running costPerMonth in OwnerPGRule");
			pgRule.wifi();
			System.out.println("running wifi in OwnerPGRule");

		} else {
			System.out.println("pgRule is null");
		}
	}

}
