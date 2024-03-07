package com.kamikase.web.posbackend.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class EsporteValidator implements
        ConstraintValidator<EsporteValidation, String> {
    private String message;
    private String [] esportesInvalido = {"futebol", "bale"};
    @Override
    public void initialize(EsporteValidation constraintAnnotation) {
        message = constraintAnnotation.message();
    }


    @Override
    public boolean isValid(String nome, ConstraintValidatorContext constraintValidatorContext) {
        if (!nome.equals("futebol") && !nome.equals("bale")) {
            return true;
        }
        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext
                .buildConstraintViolationWithTemplate(message + nome)//
                .addConstraintViolation();
        return false;
    }

}