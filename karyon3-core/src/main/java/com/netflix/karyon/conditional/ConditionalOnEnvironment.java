package com.netflix.karyon.conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.netflix.karyon.conditional.impl.OnEnvironmentCondition;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnEnvironmentCondition.class)
public @interface ConditionalOnEnvironment {
    String name();
    String value();
}
