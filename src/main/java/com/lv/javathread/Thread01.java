package com.lv.javathread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/3 10:57
 * @description ：
 */
@Slf4j
public class Thread01 {
    /**
     * 继承Thread类
     */
    public static class MyThread extends Thread {
        @Override
        public void run() {
           log.info("This is child thread");
        }
    }

    public static void main(String[] args) {
        log.info("This is father thread");
        MyThread myThread = new MyThread();

        myThread.run();

    }

}
