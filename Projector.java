class Projector
{
	String company;
    String type="hanging";
    String color;
    int  weight; 

    public void print()
	{
	    System.out.println("company:"+this.company);
		System.out.println("type:"+this.type);
		System.out.println("color:"+this.color);
		System.out.println("weight:"+this.weight);		
	}
    public void  setCompany(String company)
	{
		this.company=company;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	Projector(int weight)
	{
		this.weight=weight;
		
	}

	
}