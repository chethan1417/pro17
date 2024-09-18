package com.xworks.works.inter.imp;

import com.xworks.works.inter.MallRule;

public class GtMallRule implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("running validId in GtMallRule");
		return true;
	}

}
