class Runnerwala
{
	public static void main(String[] args)
	{
		System.out.println("start main in Runnerwala");
		Charger charger=new Charger();
		charger.brand="realme";
		charger.capacity=35;
		charger.price=2000;
		System.out.println("Charger brand:"+charger.brand);
		System.out.println("Charger Capacuty in watts:"+charger.capacity);
		System.out.println("Price:"+charger.price);
		
		Claw claw=new Claw();
		claw.animalName="tiger";
		claw.age=1;
		claw.color="white";
		System.out.println("animal name:"+claw.animalName);
		System.out.println("animal age:"+claw.age);
		System.out.println("animal color:"+claw.color);
		
		Crow crow=new Crow();
		crow.type="bird";		
		crow.age=3;
		crow.color="black";
		System.out.println("type:"+crow.type);
		System.out.println("age:"+crow.age);
		System.out.println("color:"+crow.color);
		
		Clock clock =new Clock();
		clock.brand="quartz";
		clock.color="black";
        clock.warranty=2;
		System.out.println("brand:"+clock.brand);
		System.out.println("color:"+clock.color);
		System.out.println("warranty:"+clock.warranty);
		
		Lolipop lolipop=new Lolipop();
		lolipop.brand="Alpenliebe";
		lolipop.price=10;
		lolipop.quantity=3;
		System.out.println("brand:"+lolipop.brand);
		System.out.println("brand:"+lolipop.quantity);
		System.out.println("quantity:"+lolipop.quantity);
		
		Jean jean = new Jean();
		jean.brand="H&M";
		jean.color="black";
		jean.price=2000;
	    System.out.println("brand:"+jean.brand);
	    System.out.println("color:"+jean.color);
	    System.out.println("price:"+jean.price);
		
		

		Keyboard keyboard = new Keyboard();
		keyboard.brand="Asus";
		keyboard.color="black";
		keyboard.price=5000;
	    System.out.println("brand:"+keyboard.brand);
	    System.out.println("color:"+keyboard.color);
	    System.out.println("price:"+keyboard.price);
		
		Mountain mountain =new Mountain ();
		mountain.place="chitradurga";
		mountain.distance=30;
		mountain.sundayAllowed=true;
	    System.out.println("place:"+mountain.place);
	    System.out.println("distance:"+mountain.distance);
	    System.out.println("sunday allowed:"+mountain.sundayAllowed);
		
		Stadium stadium=new Stadium();
		stadium.name="ChinnaSwamy";
		stadium.capacity=32000;
		stadium.ticketsAvailable=false;
	    System.out.println("name:"+stadium.name);
	    System.out.println("capacity:"+stadium.capacity);
	    System.out.println("tickets Avaiable:"+stadium.ticketsAvailable);
		
		Spray spray=new Spray();
		spray.name="HIT";
		spray.price=200;
		spray.petFriendly=false;
	    System.out.println("name:"+spray.name);
	    System.out.println("price:"+spray.price);
	    System.out.println("pet Friendly:"+spray.petFriendly);

		
		System.out.println("end main in Runnerwala");

		
	}
}