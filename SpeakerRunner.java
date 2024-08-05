class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker("best");
		speaker.setSize("small");
		speaker.setCost(2000);
		speaker.brand="JBL";
		speaker.display();
		
		Speaker speaker1=new Speaker("good");
		speaker1.setSize("medium");
		speaker1.setCost(4500);
		speaker1.brand="samsung";
		speaker1.display();
		
		Speaker speaker2=new Speaker("excellent");
		speaker2.setSize("big");
		speaker2.setCost(8000);
		speaker2.brand="JBL";
		speaker2.display();
		
		
		
	}
}