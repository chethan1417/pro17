class MainRunner
{
	public static void main(String[] args)
	{
   	   System.out.println("Start main in MainRunner");
	   
	   Rupee rupee=new Rupee();
	   int notes=rupee.notes;
	   int coins=rupee.coins;
	   String total=rupee.total;
	   System.out.println("Notes:"+notes);
	   System.out.println("Coins:"+coins);
       System.out.println("total:"+total);
	   
	   AirCondition airCondition= new AirCondition();
	   String brand=airCondition.brand;
	   String name=airCondition.name;
	   double price=airCondition.price;
	   System.out.println("brand:"+brand);
	   System.out.println("name:"+name);
	   System.out.println("price:"+price);
	   
	   AutoRickshaw autoRickshaw= new AutoRickshaw();
	   String pickUp=autoRickshaw.pickUp;
	   String drop=autoRickshaw.drop;
	   double price1=autoRickshaw.price;
	   System.out.println("pickUp:"+pickUp);
	   System.out.println("drop:"+drop);
	   System.out.println("price:"+price1);
	   
	   AutoDriver autoDriver=new AutoDriver();
	   String name1=autoDriver.name;
	   int age=autoDriver.age;
	   String gender=autoDriver.gender;
	   System.out.println("name:"+name1);
	   System.out.println("age:"+age);
       System.out.println("gender:"+gender);


	   Rapido rapido=new Rapido();
       String name2=rapido.name;
	   int age2=rapido.age;
	   String district=rapido.district;
	   System.out.println("name:"+name2);
	   System.out.println("age:"+age2);
       System.out.println("district:"+district);

	   CabCompany cabCompany= new CabCompany();
	   String name3=cabCompany.name;
	   String place3=cabCompany.place;
	   String vehicleType=cabCompany.vehicleType;
	   System.out.println("name:"+name3);
	   System.out.println("place:"+place3);
	   System.out.println("vehicle Type:"+vehicleType);
	   
	   BMTC bMTC= new BMTC();
	   String pickUp4=bMTC.pickUp;
	   String drop4=bMTC.drop;
	   double price4=bMTC.price;
	   System.out.println("pickUp:"+pickUp4);
	   System.out.println("drop:"+pickUp4);
	   System.out.println("price:"+pickUp4);
	   
	   FoodDeliveryCompany foodDeliveryCompany= new FoodDeliveryCompany();
	   String type=foodDeliveryCompany.type;
	   String hotel=foodDeliveryCompany.hotel;
	   String homedelivery=foodDeliveryCompany.homedelivery;
	   System.out.println("type:"+type);
	   System.out.println("hotel:"+hotel);
	   System.out.println("homedelivery:"+homedelivery);
	   

	   
	   
	   System.out.println("end main in MainRunner");


	}
	
} 