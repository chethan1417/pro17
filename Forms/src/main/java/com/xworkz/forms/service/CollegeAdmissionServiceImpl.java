package com.xworkz.forms.service;

import com.xworkz.forms.dto.CollegeAddmissionDTO;

public class CollegeAdmissionServiceImpl implements CollegeAdmissionService {

	@Override
	public boolean validateAndSave(CollegeAddmissionDTO collegeAddmissionDTO) {

		System.out.println("starting validateAndSave in CollegeAdmissionServiceImpl");
		boolean valid = true;

		if (collegeAddmissionDTO != null) {
			String name = collegeAddmissionDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
				System.out.println("Given name is valid....");
			} else {
				System.err.println("Given name is invalid");
				valid = false;
			}

			String email = collegeAddmissionDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Given email is valid....");
			} else {
				System.err.println("Given email is Invalid....");
				valid = false;
			}

			String mobile = collegeAddmissionDTO.getMobile();
			if (mobile != null && !mobile.isEmpty() && mobile.length() >= 10 && mobile.length() < 11) {
				System.out.println("valid Mobile Number");
			} else {
				System.err.println("Invalid Mobile Number");
				valid = false;
			}

			String address = collegeAddmissionDTO.getAddress();
			if (address != null && !address.isEmpty() && address.length() >= 10 && name.length() <= 40) {
				System.out.println("address is valid ");
			} else {
				System.err.println("Address is Invalid ");
				valid = false;
			}

			String fathername = collegeAddmissionDTO.getFatherName();
			if (fathername != null && !fathername.isEmpty() && fathername.length() >= 3 && fathername.length() <= 30) {
				System.out.println("Father name is valid....");
			} else {
				System.err.println("Father name is invalid");
				valid = false;
			}

			String mothername = collegeAddmissionDTO.getMotherName();
			if (mothername != null && !mothername.isEmpty() && mothername.length() >= 3 && mothername.length() <= 30) {
				System.out.println("Mother name is valid....");
			} else {
				System.err.println("Mother name is invalid");
				valid = false;
			}

			String percentage = collegeAddmissionDTO.getPercentage();
			if (percentage != null && !percentage.isEmpty() && percentage.length() >= 35
					&& percentage.length() <= 100) {
				System.out.println("Percentage is valid");
			} else {
				System.err.println("Percentage is Invalid");
				valid = false;
			}

			int age = collegeAddmissionDTO.getAge();
			if (age > 18) {
				System.out.println("Age is valid");
			} else {
				System.err.println("age is invalid");
				valid = false;
			}

		}

		return false;
	}

}
