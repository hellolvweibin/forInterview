package com.lv.java_juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/5 14:26
 * @description ：父子线程共享数据
 */
@Slf4j
public class InheritableThreadLocalTest {
    public static void main(String[] args) {
        final InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
        //主线程
        threadLocal.set("不擅技术");
        log.info("主线程");
        //子线程
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                log.info("lv ，" + threadLocal.get());
            }
        };
        thread.start();
    }
}
