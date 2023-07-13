package com.lv.java_aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/14 13:06
 * @description ：
 */
@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/hello")
    @WebLog
    public String hello(String name){
        return "Hello "+name;
    }
}
