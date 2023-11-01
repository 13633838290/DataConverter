package com.example.converter.anno;

import com.example.converter.base.DefaultConverter;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义数据转换器
 *
 * @author ld
 * @date 2023/07/22 10:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@JacksonAnnotationsInside
@JsonSerialize(using = DefaultConverter.class)
public @interface CustomConverter {
    String type() default "" ;

    String partten() default "";



}
