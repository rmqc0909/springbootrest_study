package com.github.myproject.dao;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by xiedan on 2016/12/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface Mapper {
    String value() default "";
}
