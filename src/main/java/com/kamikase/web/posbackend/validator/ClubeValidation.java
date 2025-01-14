package com.kamikase.web.posbackend.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target( { ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmailValidator.class)
public @interface ClubeValidation {
    String message() default "O Clune não é válido tente um que não seja Flamengo, Palmeiras, Fluminense, Botafogo";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
