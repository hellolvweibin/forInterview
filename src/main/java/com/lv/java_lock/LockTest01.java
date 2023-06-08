package com.lv.java_lock;

import com.lv.java_threadpool.MyThreadPoolExecutor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/7 10:05
 * @description ：
 */
@Slf4j
public class LockTest01 {
    static int x = 0;

    public static void main(String[] args) {
        x = x + 1;
        log.info("main,x:{}", x);
        MyThread myThread = new MyThread();
        myThread.start();


    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            x = x - 1;
            log.info("myThread,x:{}", x);
        }
    }
}
