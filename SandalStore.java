package com.xworks.data.store;

import com.xworks.data.Sandal;

public class SandalStore 
{
	Sandal[] sandals=new Sandal[5];
	int number;
	
	public void store(Sandal slippers)
	{
		this.sandals[this.number]=slippers;
		this.number++;
	}
	
	public void display()
	{
		for(Sandal slippers:this.sandals)
		{
			if(slippers!=null)
			{
				slippers.show();
			}
			else
			{
				System.out.println("null data");
			}
		}
	}
	

}
