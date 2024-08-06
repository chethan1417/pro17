class Country
{
	String name="India";
	String continent="Asia";
	State state=new State("Kannada");
	
	public void swalpaTorsu()
	{
		System.out.println("Country name:"+this.name);
		System.out.println("continent name:"+this.continent);
		state.swalpaTorsu();
	}
}