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
        for (String esporte : esportesInvalido ){
            if (esporte.equals(nome)) {
                constraintValidatorContext.disableDefaultConstraintViolation();
                constraintValidatorContext
                        .buildConstraintViolationWithTemplate(message + nome)//
                        .addConstraintViolation();
                return false;
            }
        }
        return true;
    }

}