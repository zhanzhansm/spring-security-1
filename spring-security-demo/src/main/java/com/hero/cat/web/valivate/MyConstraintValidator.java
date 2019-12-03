package com.hero.cat.web.valivate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Boolean> {

    @Override
    public boolean  isValid(Boolean value, ConstraintValidatorContext context) {
        return true;
    }
}
