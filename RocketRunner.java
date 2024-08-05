class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket=new Rocket(9);
		rocket.setCountry("India");
		rocket.setFuelCapacity(138000);
		rocket.print();
		
		Rocket rocket1=new Rocket(4);
		rocket1.setCountry("United states");
		rocket1.setFuelCapacity(1200000);
		rocket1.speed="7500 m/s";
		rocket1.print();
		
		Rocket rocket2=new Rocket(4);
		rocket2.setCountry("France");
		rocket2.setFuelCapacity(1200000);
		rocket2.speed="8000 m/s";
		rocket2.print();
	}
}