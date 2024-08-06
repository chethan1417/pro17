class Hotel
{
	String name="Upadya";
	Owner owner=new Owner("male");
	
	public void screen()
	{
		System.out.println("Hotel Name:"+this.name);
		owner.screen();
	}
	
}