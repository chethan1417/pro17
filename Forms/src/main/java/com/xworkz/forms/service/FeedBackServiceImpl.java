package com.xworkz.forms.service;

import com.xworkz.forms.dto.FeedBackDTO;

public class FeedBackServiceImpl implements FeedBackService {

	@Override
	public boolean validateAndSave(FeedBackDTO feedBackDTO) {

		if (feedBackDTO != null) {
			String name = feedBackDTO.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 30) {
				System.out.println("Given name is valid....");
			} else {
				System.err.println("Given name is invalid");
			}

			String email = feedBackDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Given email is valid....");
			} else {
				System.err.println("Given email is Invalid....");
			}

			String comments = feedBackDTO.getComments();
			if (comments != null && !comments.isEmpty() && comments.length() >= 3 && comments.length() <= 100) {
				System.out.println("Given comments is valid....");
			} else {
				System.err.println("Given comments is invalid");
			}

		}

		return false;
	}

}
