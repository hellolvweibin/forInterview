package com.lv.java_threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/6 12:35
 * @description ：线程池测试
 */
@Slf4j
public class ThreadPool01 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 3000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(3), new ThreadPoolExecutor.DiscardOldestPolicy());
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                log.info("{} run",Thread.currentThread().getName());
            } catch (InterruptedException e) {
                log.error("error:{}",e);
            }
        };

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        //开启三个线程
        log.info("---先开启三个线程---");
        log.info("核心线程数:{}",threadPoolExecutor.getCorePoolSize());
        log.info("线程池线程数:{}",threadPoolExecutor.getPoolSize());
        log.info("队列任务数:{}",threadPoolExecutor.getQueue().size());

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        log.info("---再开启6个线程---");
        log.info("核心线程数:{}",threadPoolExecutor.getCorePoolSize());
        log.info("线程池线程数:{}",threadPoolExecutor.getPoolSize());
        log.info("队列任务数:{}",threadPoolExecutor.getQueue().size());

        Thread.sleep(8000);
        log.info("---8秒后---");
        log.info("核心线程数:{}",threadPoolExecutor.getCorePoolSize());
        log.info("线程池线程数:{}",threadPoolExecutor.getPoolSize());
        log.info("队列任务数:{}",threadPoolExecutor.getQueue().size());

        threadPoolExecutor.shutdown();

    }

}
