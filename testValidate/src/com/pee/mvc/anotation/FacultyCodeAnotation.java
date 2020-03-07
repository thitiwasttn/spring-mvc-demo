package com.pee.mvc.anotation;

import com.pee.mvc.customize.FacultyCodeCustomImpl;
import com.pee.mvc.customize.FacultyCodeCustomInterface;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = FacultyCodeCustomImpl.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FacultyCodeAnotation {
    public String value() default "LC00";

    public String message() default "must start with LC00";

    public Class<?>[] group() default{};

    public Class<? extends Payload> [] playload()  default{};
}
