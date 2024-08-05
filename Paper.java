class Paper
{
	double thickness;
	String size;
	String quality;
	String color="white";
	
	public void print()
	{
		System.out.println("thickness:"+this.thickness);
		System.out.println("size:"+this.size);
		System.out.println("quality:"+this.quality);
		System.out.println("color:"+this.color);
	}
	public void setThickness(double thickness)
	{
		this.thickness=thickness;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	Paper(String quality)
	{
		this.quality=quality;
	}
}
