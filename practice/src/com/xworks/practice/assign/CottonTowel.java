package com.xworks.practice.assign;

public class CottonTowel  {
	
	@Override
	public void wash()//override
	{
		System.out.println("created wash in CottonTowel");
	}
	
	public void wash(int quantity)//overload
	{
		System.out.println("created wash in Cotton Towel with parameter");
	}
	
	@Override
	public void wipe()//as Towel having wipe method which is final NAS so we cant use it in other class
	{
		System.out.println("created wipe in CT");
	}

}
