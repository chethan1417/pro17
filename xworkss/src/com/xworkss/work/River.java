package com.xworkss.work;

public class River 
{
	public String[] Rivernames=new String[7];
	int position;
	
	public void storage(String Rname)
	{
		this.Rivernames[this.position]=Rname;
		this.position++;
		
	}
	
	public void torsu()
	{
		for(String Rname:Rivernames)
		{
			System.out.println("River Name:"+Rname);
			
		}
	}
	

}
