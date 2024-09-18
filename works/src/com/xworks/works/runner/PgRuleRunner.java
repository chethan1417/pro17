package com.xworks.works.runner;

import com.xworks.works.inter.PGRule;
import com.xworks.works.inter.imp.OwnerPGRule;
import com.xworks.works.inter.imp.PDHPGRule;

public class PgRuleRunner {

	public static void main(String[] args) {

		PGRule rule=new PDHPGRule();
		OwnerPGRule rules=new OwnerPGRule();
		rules.setPGRule(rule);
		rules.check();
	}

}
