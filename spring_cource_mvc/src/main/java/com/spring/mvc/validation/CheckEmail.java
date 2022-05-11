package com.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD) //применение к полю
@Retention(RetentionPolicy.RUNTIME) //аннотация будет работать вплоть до выполнения кода (runtime - самый долговечный RetentionPolicy
@Constraint(validatedBy = CheckEmailValidator.class) //класс для обработки аннотации
public @interface CheckEmail {

  public String value() default "com.com";

  public String message() default "email must ends with com.com";

  public Class<?>[] groups() default {}; //позволяет разбивать аннотации по группам

  public Class<? extends Payload>[] payload() default {}; //перенос информации о метаданных клиента
}
