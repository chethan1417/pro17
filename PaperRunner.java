class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper=new Paper("good");
		paper.setThickness(0.1);
		paper.setSize("A4");
		paper.print();
		
		Paper paper1=new Paper("excellent");
		paper1.setThickness(0.4);
		paper1.setSize("12x12");
		paper1.print();
		
		Paper paper2=new Paper("medium");
		paper2.setThickness(0.3);
		paper2.setSize("5x7");
		paper2.print();
	}
}