package com.pm.patientservice.annotation;

import com.pm.patientservice.validator.AddressValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AddressValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAddress {

    String message() default "Invalid address format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
