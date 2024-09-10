package com.xworks.practice.assign;

public class CreditCard {
	
	private String type;
	private int cardNo;
	private String expirationDate;
	private int limit;
	private int anualFee;
	private  double interestRate;
	
	public CreditCard(String type, int cardNo, String expirationDate, int limit, int anualFee, double interestRate) {
		super();
		this.type = type;
		this.cardNo = cardNo;
		this.expirationDate = expirationDate;
		this.limit = limit;
		this.anualFee = anualFee;
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {

	    if (obj!=null) {
				
				if(obj instanceof CreditCard) {
					
					CreditCard creditCard=(CreditCard)obj;
					System.out.println("use instanceof to convert subclass type into parent type");
			
					if(this.type.equals(creditCard.type) && this.cardNo==creditCard.cardNo &&this.limit==creditCard.limit)
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
