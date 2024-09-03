package com.xworks.practice.internal;

public class Gun extends Weapon {
	
	
	@Override
	protected void use()
	{
	
		System.out.println("created use in Gun");
	}
	
	@Override
	public void fire()
	{
		System.out.println("created fire in Gun");

	}

}
