package com.pee.mvc.customize;

import com.pee.mvc.anotation.FacultyCodeAnotation;

import javax.validation.ConstraintValidatorContext;

public interface FacultyCodeCustomInterface {
    public void initialize(FacultyCodeAnotation facultyCodeAnotation);
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext);
}
