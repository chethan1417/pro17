class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector(11);
		projector.setCompany("Epson");
		projector.setColor("white");
		projector.print();
		
		Projector projector1=new Projector(4);
		projector1.setCompany("BenQ");
		projector1.setColor("black");
		projector1.print();
		
		Projector projector2=new Projector(12);
		projector2.setCompany("Sony");
		projector2.setColor("white");
		projector2.print();
		
	}
}