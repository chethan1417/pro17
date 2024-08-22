package com.xworks.data;

public class MarketRunner 
{

	public static void main(String[] args) 
	{
	
		MarketStore store =new MarketStore();
		
		MarketData a=new MarketData("KR market","Bengaluru");
		MarketData b=new MarketData("RC market","Chitradurga");
		MarketData c=new MarketData("NK market","Belgavi");
		MarketData d=new MarketData("CM market","Gadag");
		MarketData e=new MarketData("VK market","davanagere");
		
		store.save(a);
		store.save(b);
		store.save(c);
		store.save(d);
		store.save(e);
		
		store.display();
		

	}

}
