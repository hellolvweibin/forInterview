package com.lv.java_aop;

import java.lang.annotation.*;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/14 09:58
 * @description ：自定义注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
}
