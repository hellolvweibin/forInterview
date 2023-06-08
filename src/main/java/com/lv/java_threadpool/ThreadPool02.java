package com.lv.java_threadpool;

import java.util.concurrent.*;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/6 14:09
 * @description ：
 */
public class ThreadPool02 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);


    }
}
