package cn.edu.gdut.zaoying.Option.parallel.parallelAxisDefault.axisLabel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MarginNumber {
    double value() default 0;
}