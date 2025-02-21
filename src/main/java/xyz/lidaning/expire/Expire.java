package xyz.lidaning.expire;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface Expire {
    long in() default 0;
    ExpireType type() default ExpireType.SECONDS;

    String at() default "";
}
