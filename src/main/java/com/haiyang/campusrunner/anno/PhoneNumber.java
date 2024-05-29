package com.haiyang.campusrunner.anno;

import com.haiyang.campusrunner.anno.constraint.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
@Documented
public @interface PhoneNumber {
    String message() default "验证手机号";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
