package com.xworkz.forms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.forms.dto.CollegeAddmissionDTO;
import com.xworkz.forms.service.CollegeAdmissionService;
import com.xworkz.forms.service.CollegeAdmissionServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/collegeApply")
public class CollegeAdmissionServlet extends HttpServlet {

	public CollegeAdmissionServlet() {
		System.out.println("Running no-arg const in CollegeAdmissionServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String fatherName = req.getParameter("fatherName");
		String motherName = req.getParameter("motherName");
		String percentage = req.getParameter("percentage");
		String course = req.getParameter("course");
		String age = req.getParameter("age");
		int convertedAge = Integer.valueOf(age);

		CollegeAddmissionDTO collegeAddmissionDTO = new CollegeAddmissionDTO(name, email, mobile, address, fatherName,
				motherName, percentage, course, convertedAge);

		System.out.println("CollegeAddmissionDTO:" + collegeAddmissionDTO);
		resp.getWriter().println(collegeAddmissionDTO);

		CollegeAdmissionService collegeAdmissionService = new CollegeAdmissionServiceImpl();
		boolean isValid = collegeAdmissionService.validateAndSave(collegeAddmissionDTO);

		if (isValid) {
			System.out.println("data is valid");
		} else {
			System.out.println("data i invalid");
		}

	}

}
