package com.xworks.practice.assign;

public class State {
	
	private String name;
	private double population;
	private double area;
	private String cm;
	private String capital;
	private int noOfDis;
	
	public State(String name, double population, double area, String cm, String capital, int noOfDis) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
		this.cm = cm;
		this.capital = capital;
		this.noOfDis = noOfDis;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {

    if (obj!=null) {
			
			if(obj instanceof State) {
				
				State state=(State)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.name.equals(state.name) && this.noOfDis==state.noOfDis &&this.capital.equals(state.capital))
				{
					System.out.println("check the two given ref are equal or not");
					return true;
				}
				else
				{
					System.out.println("both are not equals");
				}
			
			}
			else 
			{
				System.out.println("obj is null");
			}
		}
		return super.equals(obj);
	}

}
