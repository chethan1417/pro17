package com.xworks.interf.impliments;

import com.xworks.interf.rules.BankRules;

public class BankImp implements BankRules {

	@Override
	public int openTime() {
		System.out.println("created openTime in BankImp");
		return 0;
	}

	@Override
	public int closeTime() {
		System.out.println("created closeTime in BankImp");
		return 0;
	}

	@Override
	public boolean saturdayOpen() {
		System.out.println("created saturdayOpen in BankImp");
		return false;
	}

	@Override
	public double minBalance() {
		System.out.println("created minBalance in BankImp");
		return 0;
	}

	@Override
	public boolean helmetAllowed() {
		System.out.println("created helmetAllowed in BankImp");
		return false;
	}

	@Override
	public boolean silence() {
		System.out.println("created silence in BankImp");
		return false;
	}

	@Override
	public boolean atmAvailable() {
		System.out.println("created atmAvailable in BankImp");
		return false;
	}

	@Override
	public boolean queSystem() {
		System.out.println("created queSystem in BankImp");
		return false;
	}

	@Override
	public String lunchTime() {
		System.out.println("created lunchTime in BankImp");
		return null;
	}

	@Override
	public int noOfCounters() {
		System.out.println("created noOfCounters in BankImp");
		return 0;
	}

	@Override
	public String managerName() {
		System.out.println("created managerName in BankImp");
		return null;
	}

	@Override
	public int noOfBranches() {
		System.out.println("created noOfBranches in BankImp");
		return 0;
	}

	@Override
	public boolean loan() {
		System.out.println("created loan in BankImp");
		return false;
	}

	@Override
	public boolean securityCheck() {
		System.out.println("created securityCheck in BankImp");
		return false;
	}

	@Override
	public boolean cashDeposit() {
		System.out.println("created cashDeposit in BankImp");
		return false;
	}

}
