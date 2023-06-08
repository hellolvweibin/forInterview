package com.lv.javase;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三");
        log.info("实参:{}", student.getName());

    }

//    public static void f(Student p) {
//        p.setName("李四");
//        log.info("形参:{}", p.getName());
//    }
}
