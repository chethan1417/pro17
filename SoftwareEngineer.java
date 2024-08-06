class SoftwareEngineer
{
	String name="chethan";
	int experience=2;
	String designation="Front end developer";
	double salary;
	
	public void show()
	{
		System.out.println("Engineer Name:"+this.name);
		System.out.println("Experience:"+this.experience);
		System.out.println("Designation:"+this.designation);
		System.out.println("Salary:"+this.salary);

	}
	SoftwareEngineer(double salary)
	{
	     this.salary=salary;	
	}
	
}