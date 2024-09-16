package com.xworks.interf.rules;

public interface BankRules {

	int openTime();

	int closeTime();

	boolean saturdayOpen();

	double minBalance();

	boolean helmetAllowed();

	boolean silence();

	boolean atmAvailable();

	boolean queSystem();

	String lunchTime();

	int noOfCounters();

	String managerName();

	int noOfBranches();

	boolean loan();

	boolean securityCheck();

	boolean cashDeposit();

}
