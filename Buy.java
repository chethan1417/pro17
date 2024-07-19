class Buy{
	public static void product(String brand,double price)
	{
		System.out.println("running product in Buy");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		if(price>0 && price<=100)
		{
			System.out.println("Valid Price");
		}
		else
		{
			System.out.println("In-valid Price");
		}
	}
	public static void product(String name,int quantity,String quality,double price)
		{
		System.out.println("running product in BUy");
		System.out.println("Name:"+name);
		System.out.println("Quantity:"+quantity);
		System.out.println("Quality:"+quality);
		System.out.println("Price:"+price);
		
		if(quantity>0 && quantity<=10)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
			
		
		if(price>0 && price<=3000)
		{
			System.out.println("Valid Price");
		}
		else
		{
			System.out.println("In-valid Price");
		}
			
		}
		public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("running bookMovieTicket in BookMyShow");
		System.out.println("Movie Name:"+name);
		System.out.println("Theater Name:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("Ticket Price:"+price);
		
		if(quantity>0 && quantity<=10)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>100 && price<=250)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
	}
	
	public static void buySmartWatch(String brand,double price,String color,char type,int mode)
	{
		System.out.println("running buySmartWatch in BookMyShow");
		System.out.println("brand Name:"+brand);
		System.out.println("watch price:"+price);
		System.out.println("watch color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		
		
		if(mode>0 && mode<=5)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>100.0 && price<=10000.0)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
}
public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("running buyEgg in Food");
		System.out.println("total eggs:"+total);
		System.out.println("price per egg:"+pricePerEgg);


        if(total>0 && total<=100)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(pricePerEgg>0 && pricePerEgg<=6)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}		
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("running buyShampoo in Food");
		System.out.println("net weight in ml:"+quantityInMl);
		System.out.println("price per packet:"+price);
		System.out.println("brand name of shampoo:"+brand);
		System.out.println("date of manufacture:"+manfDate);
		



        if(quantityInMl>0 && quantityInMl<=5)
		{
			System.out.println("Valid Quantity");
		}
		else
		{
			System.out.println("In-valid Quantity");
		}
		
		if(price>0 && price<2)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}		
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("running buyCake in Food");
		System.out.println("size:"+size);
		System.out.println("type of cake:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost of cake:"+cost);
		System.out.println("quantity in KG:"+quantity);
		
	
        if(cost>0.0 && cost<=800.0)
		{
			System.out.println("Valid cost");
		}
		else
		{
			System.out.println("In-valid cost");
		}
		
		if(quantity>0 && quantity<=10)
			
		{
			System.out.println("Valid quantity ");
		}
		else
		{
			System.out.println("In-valid quantity");
		}		
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("running buyLaptop in Laptop");
		System.out.println("Brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("battery Capacity in mAh:"+batteryCapacity);
		System.out.println("screenSize in inches:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize in GB:"+harddiskSize);
		System.out.println("ramSize in GB:"+ramSize);
		
		if(serialNo>0 && serialNo<=10000)
		{
			System.out.println("Valid serialNo");
		}
		else
		{
			System.out.println("In-valid serialNo");
		}
		
		if(price>0.0 && price<50000.0)
		{
			System.out.println("Valid price ");
		}
		else
		{
			System.out.println("In-valid price");
		}
		
		if(batteryCapacity>1000 && batteryCapacity<4000)
		{
			System.out.println("battery Capacity is valid");
		}
		else
		{
			System.out.println("In-valid battery Capacity ");
		}	
        
		
		if(screenSize>8.0 && screenSize<=20.0)
		{
			System.out.println("Valid screenSize");
		}
		else
		{
			System.out.println("In-valid screenSize");
		}		
		
		
		if(harddiskSize>16 && harddiskSize<=1000)
		{
			System.out.println("Valid harddisk Size");
		}
		else
		{
			System.out.println("In-valid harddisk Size");
		}

        if(ramSize>4 && ramSize<=192)
		{
			System.out.println("Valid ram Size");
		}
		else
		{
			System.out.println("In-valid ram Size");
		}				
		
	}
	
		
}



