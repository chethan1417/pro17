package com.xworks.inheritance.things;

public class ProviderRunner {

	public static void main(String[] args) {

		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider = new BookMyShowMovieBookingProvider("BMS",
				"varun", 5);
		bookMyShowMovieBookingProvider.service();
		System.out.println(bookMyShowMovieBookingProvider.toString());
		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider1 = new BookMyShowMovieBookingProvider("BMS",
				"varun", 3);
		bookMyShowMovieBookingProvider1.service();
		boolean same=bookMyShowMovieBookingProvider1.equals(bookMyShowMovieBookingProvider);
		System.out.println(bookMyShowMovieBookingProvider1.toString());
		System.out.println("LHS equals RHS :"+same);
		System.out.println();

		MovieBookingProvider movieBookingProvider = new MovieBookingProvider("tick-ets", "akhil");
		movieBookingProvider.book();
		movieBookingProvider.cancel();
		movieBookingProvider.service();
		System.out.println(movieBookingProvider.toString());
		MovieBookingProvider movieBookingProvider1 = new MovieBookingProvider("tick-ets", "akhil");
		movieBookingProvider1.book();
		movieBookingProvider1.cancel();
		movieBookingProvider1.service();
		System.out.println(movieBookingProvider1.toString());
		boolean same1=movieBookingProvider1.equals(movieBookingProvider);
		System.out.println("LHS equals RHS :"+same1);
		System.out.println();

		BookingProvider bookingProvider = new BookingProvider("bookhere", "alok");
		bookingProvider.service();
		System.out.println(bookingProvider.toString());
		BookingProvider bookingProvider1 = new BookingProvider("bookhere", "liki");
		boolean same2=bookingProvider1.equals(bookingProvider);
		bookingProvider1.service();
		System.out.println(bookingProvider.toString());
		System.out.println("LHS equals RHS :"+same2);
		System.out.println();

		LenovoProvider lenovoProvider = new LenovoProvider("lenovoserver", "yashu", 10000);
		lenovoProvider.service();
		System.out.println(lenovoProvider.toString());
		LenovoProvider lenovoProvider1 = new LenovoProvider("lenovoserver", "yashu", 10000);
		lenovoProvider1.service();
		boolean same3 =lenovoProvider1.equals(lenovoProvider);
		System.out.println(lenovoProvider1.toString());
		System.out.println("LHS equals RHS :"+same3);
		System.out.println();

		DellProvider dellProvider = new DellProvider("dell server", "chandan");
		dellProvider.service();
		System.out.println(dellProvider.toString());
		DellProvider dellProvider1 = new DellProvider("dell", "chandu");
		boolean same4=dellProvider1.equals(dellProvider);
		dellProvider1.service();
		System.out.println(dellProvider1.toString());
		System.out.println("LHS equals RHS :"+same4);
		System.out.println();

		InternetProvider internetProvider = new InternetProvider("int pro", "varu");
		boolean same5=internetProvider.equals(dellProvider);
		internetProvider.service();
		System.out.println(internetProvider.toString());
		System.out.println("LHS equals RHS :"+same5);
		System.out.println();

		JioInternetProvider jioInternetProvider = new JioInternetProvider("jioserver", "chandan");
		jioInternetProvider.service();
		boolean same6=jioInternetProvider.equals(lenovoProvider1);
		System.out.println(jioInternetProvider.toString());
		System.out.println("LHS equals RHS :"+same6);
		System.out.println();

		SatJioInternetProvider satJioInternetProvider = new SatJioInternetProvider("satlaunch", "alok", 200000,
				"12/12/2024");
		satJioInternetProvider.service();	
		boolean same7=satJioInternetProvider.equals(internetProvider);
		System.out.println(satJioInternetProvider.toString());
		System.out.println("LHS equals RHS :"+same7);
		System.out.println();

		AirtelInternetProvider airtelInternetProvider = new AirtelInternetProvider("airnet", "liki");
		airtelInternetProvider.service();
		boolean same8=airtelInternetProvider.equals(bookingProvider);
		System.out.println(airtelInternetProvider.toString());
		System.out.println("LHS equals RHS :"+same8);
		System.out.println();

		ExtremeAirtelInternetProvider extremeAirtelInternetProvider = new ExtremeAirtelInternetProvider("extAirnet",
				"chethan");
		extremeAirtelInternetProvider.service();
		boolean same9=extremeAirtelInternetProvider.equals(airtelInternetProvider);
		System.out.println(extremeAirtelInternetProvider.toString());
		System.out.println("LHS equals RHS :"+same9);
		System.out.println();

		Fast5gExtreme fast5gExtreme = new Fast5gExtreme("ex5g", "naga");
		fast5gExtreme.service();
		boolean same10=fast5gExtreme.equals(airtelInternetProvider);
		System.out.println(fast5gExtreme.toString());
		System.out.println("LHS equals RHS :"+same10);
		System.out.println();

	}

}
