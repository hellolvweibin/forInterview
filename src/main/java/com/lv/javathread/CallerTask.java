package com.lv.javathread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
@Slf4j
public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        log.info("call");
        return "Hello,i am running!";
    }
    public static void main(String[] args) {
        //创建异步任务
        FutureTask<String> task = new FutureTask<>(new CallerTask());
        //启动线程
        new Thread(task).start();
        try {
            String result = task.get();
            log.info("result:{}",result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

