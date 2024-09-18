package com.xworks.works.inter.imp;

import com.xworks.works.inter.MallRule;

public class VisiterMallRule {

	private MallRule mallRule;

	public void setMallRule(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void check() {
		if (mallRule != null) {
			boolean rule = mallRule.validId();
			if (rule) {
				System.out.println("rule passed");
			} else {
				System.out.println("rule not passed");
			}
		} else {
			System.out.println("mallRule is null");
		}
	}

}
