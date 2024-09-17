package com.xworks.interf.impliments;

import com.xworks.interf.rules.BankRules;
import com.xworks.interf.rules.CollegeRules;

public interface Gloves extends BankRules , CollegeRules{

	//a interface can inherit one or more interfacess
	//but an interface can't inherit a class
	//and interface can't implement other interface 
}
