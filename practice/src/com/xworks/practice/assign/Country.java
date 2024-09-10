package com.xworks.practice.assign;

public class Country {
	
	
	
	private String name;
	private String capital;
	private int noOfStates;
	private double population;
	private int noOfRivers;
	private String PM;
	
	public Country(String name, String capital, int noOfStates, double population, int noOfRivers, String pM) {
		super();
		this.name = name;
		this.capital = capital;
		this.noOfStates = noOfStates;
		this.population = population;
		this.noOfRivers = noOfRivers;
		PM = pM;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
if (obj!=null) {
			
			if(obj instanceof Country) {
				
				Country country=(Country)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.name.equals(country.name) && this.noOfStates==country.noOfStates &&this.capital.equals(country.capital))
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
