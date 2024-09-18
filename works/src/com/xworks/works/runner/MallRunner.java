package com.xworks.works.runner;

import com.xworks.works.inter.MallRule;
import com.xworks.works.inter.imp.GtMallRule;
import com.xworks.works.inter.imp.VisiterMallRule;

public class MallRunner {

	public static void main(String[] args) {

		MallRule rules=new GtMallRule();
		VisiterMallRule visit=new VisiterMallRule(); 
		visit.setMallRule(rules);
		visit.check();
	}

}
