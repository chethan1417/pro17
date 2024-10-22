package com.xworkz.forms.service;

import com.xworkz.forms.dto.FeedBackDTO;

public interface FeedBackService {

	boolean validateAndSave(FeedBackDTO feedBackDTO);

}
