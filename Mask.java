class Mask
{
	double cost;
	char size;
	String material;
	
    Mask()
	{
		
	}
	
	 Mask(double cost)
	{
		this.cost=cost;
		
	}
	Mask(char size)
	{
		this.size=size;
	}
    Mask(String material)
	{
		this.material=material;
	}
	Mask(double cost,char size,String material)
	{
		this.cost=cost;
		this.size=size;
		this.material=material;
	}
	Mask(double cost,char size)
	{
		this.cost=cost;
		this.size=size;
		
	}
}

