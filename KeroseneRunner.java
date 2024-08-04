class KeroseneRunner
{
	public static void main(String[] args)
	{
		Kerosene kerosene1=new Kerosene(55,1,true);
		Kerosene kerosene2=new Kerosene(false);
		Kerosene kerosene3=new Kerosene(60);
		
		System.out.println("price:"+kerosene1.price);
		System.out.println("quantity:"+kerosene1.quantity);
		System.out.println("quality:"+kerosene1.quality);
		System.out.println("quality:"+kerosene2.quality);
		System.out.println("price:"+kerosene3.price);

	}
}