package com.lv.java_juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/5 09:21
 * @description ：
 */
@Slf4j
public class Juc01 {
    //创建一个ThreadLocal变量
    public static ThreadLocal<String> localVariable = new ThreadLocal<>();
    public static void main(String[] args) {
        localVariable.set("张三");
        log.info("{}",localVariable.get());
        localVariable.remove();

    }

}
