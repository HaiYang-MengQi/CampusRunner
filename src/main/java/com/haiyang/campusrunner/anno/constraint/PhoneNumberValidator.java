package com.haiyang.campusrunner.anno.constraint;

import com.haiyang.campusrunner.anno.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    private static final String MOBILE_REGEX = "^1(3[0-9]|4[5,7]|5[0-35-9]|7[6-8]|8[0-9]|9[8,9])\\d{8}$";
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.matches(MOBILE_REGEX);
    }
}
