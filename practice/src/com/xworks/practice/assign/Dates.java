package com.xworks.practice.assign;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dates {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("date today:" + today);

		LocalDate futureDate = today.plusDays(45);
		System.out.println("Future Date: " + futureDate);

		LocalDate pastDate = today.minusDays(2);
		System.out.println("Past Date: " + pastDate);

		LocalDateTime today1 = LocalDateTime.now();
		System.out.println("date and time now:" + today1);

		LocalDateTime futureDateAndTime = today1.plusDays(2);
		System.out.println("future date and time:" + futureDateAndTime);

		LocalDateTime pastDateAndTime = today1.minusDays(2);
		System.out.println("past date and time:" + pastDateAndTime);

	}

}
