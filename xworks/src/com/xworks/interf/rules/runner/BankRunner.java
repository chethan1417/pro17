package com.xworks.interf.rules.runner;

import com.xworks.interf.impliments.BankImp;

public class BankRunner {

	public static void main(String[] args) {

		BankImp bank = new BankImp();
		System.out.println(bank.atmAvailable());
		System.out.println(bank.cashDeposit());
		System.out.println(bank.closeTime());
		System.out.println(bank.helmetAllowed());
		System.out.println(bank.loan());
		System.out.println(bank.lunchTime());
		System.out.println(bank.managerName());
		System.out.println(bank.minBalance());
		System.out.println(bank.noOfBranches());
		System.out.println(bank.noOfCounters());
		System.out.println(bank.openTime());
		System.out.println(bank.queSystem());
		System.out.println(bank.saturdayOpen());
		System.out.println(bank.securityCheck());
		System.out.println(bank.silence());

	}

}
