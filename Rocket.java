class Rocket
{
	String country;
	String speed="7800 m/s";
	int fuelCapacity;
	int noOfThrusters;
	
	public void print()
	{
		System.out.println("country:"+this.country);
		System.out.println("Speed:"+this.speed);
		System.out.println("Fuel Capacity:"+this.fuelCapacity);
		System.out.println("Number of Thrusters used:"+this.noOfThrusters);

	}

	public void setCountry(String country)
	{
		this.country=country;
	}

	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	Rocket(int noOfThrusters)
	{
		this.noOfThrusters=noOfThrusters;
	}
	
}