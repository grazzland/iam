package com.headstartech.iam.core.annotations;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Profile(QA.name)
public @interface QA {

    public static final String name = "qa";

}
