package com.kamikase.web.posbackend.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target( { ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EsporteValidator.class)
public @interface EsporteValidation {
    String message() default "Futebol e Balé não são aceitos ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}