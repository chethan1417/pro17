package com.xworkss.work;

public class City 
{
	private String[] districtnames=new String[7];
	int counts;
	
	public void storage(String Dname)
	{
		this.districtnames[this.counts]=Dname;
		this.counts++;
	}
	
	public void torsu()
	{
		for(String Dname:districtnames)
		{
			System.out.println("District name:"+Dname);
		}
	}
}
