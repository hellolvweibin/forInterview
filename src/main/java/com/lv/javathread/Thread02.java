package com.lv.javathread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/3 11:01
 * @description ：
 */
@Slf4j
public class Thread02 implements Runnable{

    @Override
    public void run() {
        log.info("Runnable!");
    }

    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();
        log.info("main");
        new Thread(thread02).start();

    }
}
