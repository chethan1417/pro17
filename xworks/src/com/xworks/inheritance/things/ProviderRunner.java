package com.xworks.inheritance.things;

public class ProviderRunner {

	public static void main(String[] args) {

		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider = new BookMyShowMovieBookingProvider("BMS",
				"varun", 5);
		bookMyShowMovieBookingProvider.toString();
		bookMyShowMovieBookingProvider.service();
		System.out.println(bookMyShowMovieBookingProvider);
		BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider1 = new BookMyShowMovieBookingProvider("BMS",
				"varun", 3);
		bookMyShowMovieBookingProvider1.toString();
		bookMyShowMovieBookingProvider1.service();
		bookMyShowMovieBookingProvider1.equals(bookMyShowMovieBookingProvider);
		System.out.println(bookMyShowMovieBookingProvider1);
		System.out.println();

		MovieBookingProvider movieBookingProvider = new MovieBookingProvider("tick-ets", "akhil");
		movieBookingProvider.book();
		movieBookingProvider.cancel();
		movieBookingProvider.service();
		movieBookingProvider.toString();
		System.out.println(movieBookingProvider);
		MovieBookingProvider movieBookingProvider1 = new MovieBookingProvider("tick-ets", "akhil");
		movieBookingProvider1.book();
		movieBookingProvider1.cancel();
		movieBookingProvider1.service();
		movieBookingProvider1.toString();
		System.out.println(movieBookingProvider1);
		System.out.println();

		BookingProvider bookingProvider = new BookingProvider("bookhere", "alok");
		bookingProvider.service();
		bookingProvider.toString();
		System.out.println(bookingProvider);
		BookingProvider bookingProvider1 = new BookingProvider("bookhere", "liki");
		bookingProvider1.equals(bookingProvider);
		bookingProvider1.service();
		bookingProvider.toString();
		System.out.println(bookingProvider1);
		System.out.println();

		LenovoProvider lenovoProvider = new LenovoProvider("lenovoserver", "yashu", 10000);
		lenovoProvider.service();
		lenovoProvider.toString();
		System.out.println(lenovoProvider);
		LenovoProvider lenovoProvider1 = new LenovoProvider("lenovoserver", "yashu", 10000);
		lenovoProvider1.service();
		lenovoProvider1.toString();
		lenovoProvider1.equals(lenovoProvider);
		System.out.println(lenovoProvider1);
		System.out.println();

		DellProvider dellProvider = new DellProvider("dell server", "chandan");
		dellProvider.service();
		dellProvider.toString();
		System.out.println(dellProvider);
		DellProvider dellProvider1 = new DellProvider("dell", "chandu");
		dellProvider1.equals(dellProvider);
		dellProvider1.service();
		dellProvider1.toString();
		System.out.println(dellProvider1);
		System.out.println();

		InternetProvider internetProvider = new InternetProvider("int pro", "varu");
		internetProvider.equals(dellProvider);
		internetProvider.service();
		internetProvider.toString();
		System.out.println(internetProvider);
		System.out.println();

		JioInternetProvider jioInternetProvider = new JioInternetProvider("jioserver", "chandan");
		jioInternetProvider.service();
		jioInternetProvider.toString();
		jioInternetProvider.equals(lenovoProvider1);
		System.out.println();

		SatJioInternetProvider satJioInternetProvider = new SatJioInternetProvider("satlaunch", "alok", 200000,
				"12/12/2024");
		satJioInternetProvider.service();
		satJioInternetProvider.toString();
		satJioInternetProvider.equals(internetProvider);
		System.out.println(satJioInternetProvider);
		System.out.println();

		AirtelInternetProvider airtelInternetProvider = new AirtelInternetProvider("airnet", "liki");
		airtelInternetProvider.service();
		airtelInternetProvider.toString();
		airtelInternetProvider.equals(bookingProvider);
		System.out.println(airtelInternetProvider);
		System.out.println();

		ExtremeAirtelInternetProvider extremeAirtelInternetProvider = new ExtremeAirtelInternetProvider("extAirnet",
				"chethan");
		extremeAirtelInternetProvider.service();
		extremeAirtelInternetProvider.toString();
		extremeAirtelInternetProvider.equals(airtelInternetProvider);
		System.out.println(extremeAirtelInternetProvider);
		System.out.println();

		Fast5gExtreme fast5gExtreme = new Fast5gExtreme("ex5g", "naga");
		fast5gExtreme.service();
		fast5gExtreme.toString();
		fast5gExtreme.equals(airtelInternetProvider);
		System.out.println(fast5gExtreme);
		System.out.println();

	}

}
