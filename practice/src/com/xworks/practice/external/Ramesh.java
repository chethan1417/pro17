package com.xworks.practice.external;

import com.xworks.practice.internal.Gun;
import com.xworks.practice.internal.Weapon;

public class Ramesh extends Weapon {
	
	public void man()
	{
		Weapon weapon =new Weapon();
		weapon.fire();
		use();
	}
	
	public void superman()
	{
		fire();
		use();
		
	}
	//parent : any child
	public void secure(Weapon weapon)
	{
		weapon.fire();
	
		if(weapon instanceof Gun)
		{
			Gun gun=(Gun)weapon;
			gun.round();
		}
		
		
	}

}
