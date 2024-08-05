class Chocolate
{
	String brand;
	double price;
	String flavour;
	String size="large";
	
	public void print()
	{
		System.out.println("brand:"+this.brand);
		System.out.println("price:"+this.price);
		System.out.println("flavour:"+this.flavour);
		System.out.println("size:"+this.size);
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	Chocolate(String flavour)
	{
		this.flavour=flavour;
	}
}