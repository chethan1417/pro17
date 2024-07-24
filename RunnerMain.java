class RunnerMain
{
	public static void main(String[] args)
	{
       System.out.println("start main in RunnerMain");
	   
	  
	   Matrimony matrimony=new Matrimony();
	   String nameOfM=matrimony.nameOfM;
	   int ageOfM=matrimony.ageOfM;
	   String genderOfM=matrimony.genderOfM;
	   System.out.println("name:"+nameOfM);
	   System.out.println("age:"+ageOfM);
       System.out.println("gender:"+genderOfM);
	   
	   matrimony.nameOfM="Chethan";
	   matrimony.ageOfM=22;
	   matrimony.genderOfM="Male";
	   System.out.println("name:"+matrimony.nameOfM);
	   System.out.println("age:"+matrimony.ageOfM);
       System.out.println("gender:"+matrimony.genderOfM);
	   
	   Application application=new Application();
	   String name1=application.name;
	   int size=application.size;
	   int rating=application.rating;
	   System.out.println("name:"+name1);
	   System.out.println("size in Gb:"+size);
       System.out.println("rating:"+rating);
	   
	   application.name="BGMI";
	   application.size=2;
	   application.rating=4;
	   System.out.println("name:"+application.name);
	   System.out.println("size in Gb :"+ application.size);
       System.out.println("rating:"+application.rating);
	   
	   Fruit fruit=new Fruit();
	   String nameOfFruit=fruit.name;
	   String colorOfFruit=fruit.color;
	   double price2=fruit.price;
	   System.out.println("name:"+nameOfFruit);
	   System.out.println("color:"+colorOfFruit);
       System.out.println("price:"+price2);
	   
	   fruit.name="Grape Juice";
	   fruit.color="Purple";
	   fruit.price=40;
	   System.out.println("name:"+fruit.name);
	   System.out.println("color:"+fruit.color);
       System.out.println("price:"+fruit.price);
	   
	   
	   Place place=new Place();
	   String placeName=place.placeName;
	   int distance=place.distance;
	   String modeofTransport=place.modeofTransport;
	   System.out.println("placeName:"+placeName);
	   System.out.println("distance:"+distance);
       System.out.println("modeofTransport:"+modeofTransport);
	   
	   place.placeName="chitradurga";
	   place.distance=200;
	   place.modeofTransport="Bus";
	   System.out.println("placeName:"+place.placeName);
	   System.out.println("distance:"+place.distance);
       System.out.println("modeofTransport:"+place.modeofTransport);
	   
	   
	   
	   Alcohol alcohol=new Alcohol();
	   String brandname=alcohol.brandname;
	   String typeofDrink=alcohol.typeofDrink;
	   double cost=alcohol.cost;
	   System.out.println("brand name:"+brandname);
	   System.out.println("type of Drink:"+typeofDrink);
       System.out.println("cost:"+cost);
	   
	   alcohol.brandname="Old monk";
	   alcohol.typeofDrink="Rum";
	   alcohol.cost=1499;
	   System.out.println("brand name:"+alcohol.brandname);
	   System.out.println("type of Drink:"+alcohol.typeofDrink);
       System.out.println("cost:"+alcohol.cost);
	   
	   
	   
	   Candy candy=new Candy();
	   String candyName=candy.candyName;
	   double candyPrice=candy.candyPrice;
	   int quantity=candy.quantity;
	   System.out.println("candy Name:"+candyName);
	   System.out.println("candy Price:"+candyPrice);
       System.out.println("quantity:"+quantity);
	   
	   candy.candyName="Star candy";
	   candy.candyPrice=50;
	   candy.quantity=5;
	   System.out.println("candy Name:"+candy.candyName);
	   System.out.println("candy Price:"+candy.candyPrice);
       System.out.println("quantity:"+candy.quantity);
	   
	   
	   Medicine1 medicine1=new Medicine1();
	   String tabsName=medicine1.tabsName;
	   int quantity6=medicine1.quantity6;
	   double price6=medicine1.price6;
	   System.out.println("tabs Name:"+tabsName);
	   System.out.println("quantity:"+quantity6);
       System.out.println("price:"+price6);
	   
	   medicine1.tabsName="dolo";
	   medicine1.quantity6=10;
	   medicine1.price6=99;
	   System.out.println("tabs Name:"+medicine1.tabsName);
	   System.out.println("quantity:"+medicine1.quantity6);
       System.out.println("price:"+medicine1.price6);
	   
	   
	   
	    Food2 food2=new Food2();
	   String foodtype=food2.foodtype;
	   String hotel=food2.hotel;
	   double bill=food2.bill;
	   System.out.println("food type:"+foodtype);
	   System.out.println("hotel:"+hotel);
       System.out.println("price:"+bill);
	   
	   food2.foodtype="veg";
	   food2.hotel="aramane";
	   food2.bill=249;
	   System.out.println("foodtype:"+food2.foodtype);
	   System.out.println("hotel:"+food2.hotel);
       System.out.println("price:"+food2.bill);
	   
	 
	   
	    System.out.println("end main in RunnerMain");

	}
}
	
