package com.xworks.data.store;

import com.xworks.data.Sandal;

public class SandalRunner
{

	public static void main(String[] args) 
	{
	
		SandalStore store=new SandalStore();
		
		Sandal data1=new Sandal("Crocs",'M',4000,"grey");
		Sandal data2=new Sandal("Sparx",'L',800,"black");
		Sandal data3=new Sandal("Puma",'M',2500,"black");
		Sandal data4=new Sandal("bata",'S',600,"white");
		Sandal data5=new Sandal("Crocs",'M',3000,"white");
		store.store(data1);
		store.store(data2);
		store.store(data3);
		store.store(data4);
		store.store(data5);
		
		
	    store.display();
		

	}

}
