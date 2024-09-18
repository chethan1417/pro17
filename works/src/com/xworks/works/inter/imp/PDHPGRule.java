package com.xworks.works.inter.imp;

import com.xworks.works.inter.PGRule;

public class PDHPGRule implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("created costPerMonth in PDHPGRule");
		return 0;
	}

	@Override
	public boolean wifi() {
		System.out.println("created wifi in PDHPGRule");
		return false;
	}

}
