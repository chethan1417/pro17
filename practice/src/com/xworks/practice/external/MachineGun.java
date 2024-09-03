package com.xworks.practice.external;

import com.xworks.practice.internal.Weapon;

public class MachineGun extends Weapon {
	
	
	@Override
	protected void use()
	{
		System.out.println("created use in MachineGun");
	}
	
	@Override
	public void fire()
	{
		System.out.println("created fire in MachineGun");
	}
	
	public void danger()
	{
		use();
		fire();
	}

}
