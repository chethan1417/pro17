package com.xworkss.work;

public class Sweet
{
	private String[] SweetNames=new String[7];
	int number;
	
	public void store(String Sweetname)
	{
		this.SweetNames[this.number]=Sweetname;
		this.number++;
	}
	
	public void shows()
	{
		for(String Sweetname:SweetNames)
		{
			System.out.println("sweet name:"+Sweetname);
		}
	}

}
