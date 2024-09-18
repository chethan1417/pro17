package com.xworks.works.inter.imp;

import com.xworks.works.inter.CricketRule;

public class Bcci {

	private CricketRule cricketrule;

	public void setCricketRule(CricketRule cricketRule) {
		this.cricketrule = cricketRule;

	}

	public void check() {
		if (cricketrule != null) {
			System.out.println("cricketrule is not null");
			cricketrule.legBeforewicket();
		} else {
			System.out.println("cricketrule is null");
		}
	}

}
