class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate("fruit and nut");
		chocolate.setBrand("dairy milk");
		chocolate.setPrice(180);
		chocolate.print();
		
		
		Chocolate chocolate1=new Chocolate("oreo");
		chocolate1.setBrand("dairy milk");
		chocolate1.setPrice(100);
		chocolate1.size="small";
		chocolate1.print();
		
		Chocolate chocolate2=new Chocolate("roasted almond");
		chocolate2.setBrand("dairy milk");
		chocolate2.setPrice(140);
		chocolate2.size="medium";
		chocolate2.print();
		
	}
}