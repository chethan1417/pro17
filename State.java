class State
{
	String name="Karnataka";
	String language;
	CapitalCity capitalCity=new CapitalCity();
	
	State(String language)
	{
		this.language=language;
	}
	public void swalpaTorsu()
	{
		System.out.println("state name:"+this.name);
		System.out.println("Language:"+this.language);
		capitalCity.swalpaTorsu();

	}
}