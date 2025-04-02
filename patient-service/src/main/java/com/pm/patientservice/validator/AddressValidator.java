package com.pm.patientservice.validator;

import com.pm.patientservice.annotation.ValidAddress;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<ValidAddress, String> {

    @Override
    public void initialize(ValidAddress constraintAnnotation) {
    }

    @Override
    public boolean isValid(String address, ConstraintValidatorContext context) {
        if (address == null || address.trim().isEmpty()) {
            return false;
        }
        return address.length() >= 5;
    }
}
