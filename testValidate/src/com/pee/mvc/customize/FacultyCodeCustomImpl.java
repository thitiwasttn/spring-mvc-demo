package com.pee.mvc.customize;

import com.pee.mvc.anotation.FacultyCodeAnotation;
import com.pee.mvc.model.CustomerM;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FacultyCodeCustomImpl implements ConstraintValidator<FacultyCodeAnotation,String> {

    private String coursePrefix;

//    @Override
//    public void initialize(FacultyCodeAnotation constraintAnnotation) {
//
//    }
//
//    @Override
//    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
//        return false;
//    }


    @Override
    public void initialize(FacultyCodeAnotation facultyCodeAnotation) {
        coursePrefix = facultyCodeAnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }


        return result;
    }
}
