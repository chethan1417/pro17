package com.xworks.data;

public class SidedishStore 
{
	SidedishData[] info = new SidedishData[5];
	int counts;
	
	public void save(SidedishData data)
	{
		this.info[this.counts]=data;
		counts++;
		
	}
	
	public void display()
	{
		for(SidedishData data:info)
		{
			if(data!=null)
			{
				data.torsu();
			}
			else
			{
				System.out.println("null data");
			}
		}
	}

}
