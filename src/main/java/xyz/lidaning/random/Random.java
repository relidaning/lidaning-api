package xyz.lidaning.random;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Random {
    String[] value() default "";

    int[] integers() default 0;

    String[] dates() default "";
}
