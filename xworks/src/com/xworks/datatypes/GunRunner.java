package com.xworks.datatypes;

import com.xworks.datatypes.things.DBoss;
import com.xworks.datatypes.things.Godse;
import com.xworks.datatypes.things.Gun;
import com.xworks.datatypes.things.Police;
import com.xworks.datatypes.things.Soldier;

public class GunRunner {

	public static void main(String[] args)
	{
		Soldier soldier = new Soldier();
		soldier.shoot();
		
		Police police=new Police();
		Gun gun=new Gun("M416","Russia","AR");
		police.fight(gun);
		
		 DBoss dBoss=new DBoss();
		 Gun gun1=new Gun("kar98","india","sniper");
		 dBoss.gun=gun1;
		 dBoss.jail();
		 
		 Godse godse=new Godse();
		 godse.murder();		
	
	}

}
