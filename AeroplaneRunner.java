class AeroplaneRunner
{
	public static void main(String[] args)
	{
		Aeroplane aeroplane1= new Aeroplane("Air India",150,5000,"Bengaluru","Delhi");
		Aeroplane aeroplane2= new Aeroplane("Indigo","Bengaluru","vietnam");
		Aeroplane aeroplane3= new Aeroplane("Air vistara",2324,"bengaluru","Goa");
		
		System.out.println("company:"+aeroplane1.company);
		System.out.println("no of seats:"+aeroplane1.noOfSeats);
		System.out.println("ticket price:"+aeroplane1.ticketPrice);
		System.out.println("source:"+aeroplane1.source);
		System.out.println("destination:"+aeroplane1.destination);
		System.out.println("company:"+aeroplane2.company);
		System.out.println("source:"+aeroplane2.source);
		System.out.println("destination:"+aeroplane2.destination);
		System.out.println("company:"+aeroplane3.company);
		System.out.println("price:"+aeroplane3.ticketPrice);
		System.out.println("source:"+aeroplane3.source);
		System.out.println("destination:"+aeroplane3.destination);


	}
}
