package com.xworkss.work;

public class Dam 
{
	private String[] Damnames=new String[7];
	int num;
	
	public void storemadko(String Dname)
	{
		this.Damnames[this.num]=Dname;
		num++;
	}
	
	public void torsu()
	{
		for(String Dname:Damnames)
		{
			System.out.println("Dam name:"+Dname);
		}
	}

}
