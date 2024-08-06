class Company
{
	int id=12123;
	String name="Xworks";
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer(60000);
	
	Company(String location)
	{
		this.location=location;
	}
	
	public void show()
	{
		System.out.println("company id:"+this.id);
		System.out.println("company name:"+this.name);
		System.out.println("company location:"+this.location);
		softwareEngineer.show();	
	}
	
	
}