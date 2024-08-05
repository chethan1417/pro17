class Speaker
{
	String brand="boat";
	String size;
	double cost;
	String output;
	
	public void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Size:"+this.size);
		System.out.println("Cost:"+this.cost);
		System.out.println("Output:"+this.output);

	}

	public void setSize(String size)
	{
		this.size=size;
	}

	public void setCost(double cost)
	{
		this.cost=cost;
	}
	Speaker(String output)
	{
		this.output=output;
	}
	
}