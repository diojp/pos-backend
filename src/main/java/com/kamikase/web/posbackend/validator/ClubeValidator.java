package com.kamikase.web.posbackend.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ClubeValidator implements ConstraintValidator<ClubeValidation, String> {
    private String message;
    private final String [] clubsInvalids = {"Flamengo", "Palmeiras", "Fluminense", "Botafogo"};

    @Override
    public void initialize(ClubeValidation constraintAnnotation) {
        message = constraintAnnotation.message();
    }


    @Override
    public boolean isValid(String nome, ConstraintValidatorContext constraintValidatorContext) {
        for (String clubes : clubsInvalids){
            if (clubes.equals(nome)) {
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
