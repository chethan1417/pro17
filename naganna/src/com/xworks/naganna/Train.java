package com.xworks.naganna;

public class Train {
		
		private int trainNo;
		private String source;
		private String destination;
		

		public Train(int trainNo, String source, String destination) {
			super();
			this.trainNo = trainNo;
			this.source = source;
			this.destination = destination;
		}


		public Train(int trainNo, String destination) {
			super();
			this.trainNo=trainNo;
			this.destination = destination;
		}
		
		public void display()
		{
			System.out.println("Train No:"+this.trainNo);
			System.out.println("Source:"+this.source);
			System.out.println("Destination :"+this.destination);
		}
		
		
		
		
		
	

}
