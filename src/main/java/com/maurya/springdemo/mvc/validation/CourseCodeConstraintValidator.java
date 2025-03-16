package com.maurya.springdemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode!=null) {
			result=theCode.startsWith(coursePrefix);
		}else {
			result=true;
		}
		
		return result;
	}

}
