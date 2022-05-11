package com.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//в ConstraintValidator мы должны указать два Дженерика: 1 - сама аннотация, которую будет обрабатывать класс; 2 - тип данных, к которому будет применена аннотация
public class CheckEmailValidator implements
    ConstraintValidator<CheckEmail, String> {

  private String endOfEmail;

  @Override
  public void initialize(CheckEmail checkEmail) {
    endOfEmail = checkEmail.value();
  }

  @Override
  public boolean isValid(String enteredValue,
      ConstraintValidatorContext constraintValidatorContext) {
    return enteredValue.endsWith(endOfEmail);
  }
}
