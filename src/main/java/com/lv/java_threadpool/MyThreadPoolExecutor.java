package com.lv.java_threadpool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/6 15:32
 * @description ：自定义线程池
 */
public class MyThreadPoolExecutor implements Executor {
    /**
     * 线程池重的线程数量
     */
    private final AtomicInteger ctl = new AtomicInteger(0);
    /**
     * 核心线程数
     */
    private volatile int corePoolSize;
    /**
     * 最大线程数
     */
    private volatile int maximumPoolSize;
    /**
     * 阻塞队列
     */
    private final BlockingQueue<Runnable> workQueue;

    public MyThreadPoolExecutor(int corePoolSize, int maximumPoolSize, BlockingQueue<Runnable> workQueue) {
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.workQueue = workQueue;
    }


    /**
     * 执行器
     */
    @Override
    public void execute(Runnable command) {
        //工作线程数
        int c = ctl.get();
        //小于核心线程数
        if(c < corePoolSize){
            //添加任务失败
            if(!addWorker(command)){
                //执行拒绝策略
                reject();
            }
            return;
        }
        //任务队列添加任务
        if(!workQueue.offer(command)){
            //任务队列满
            if(!addWorker(command)){
                //执行拒绝策略
                reject();
            }
        }




    }
    /**
     * 饱和拒绝
     */
    private void reject(){
        //直接抛出异常
        throw new RuntimeException("Can not execute!ctl.count:"+ctl.get()+"workQueue size:"+workQueue.size());
    }

    /**
     * 添加任务
     */
    private boolean addWorker(Runnable firstTask){
        if(ctl.get()>=maximumPoolSize){
            return false;
        }
        Worker worker = new Worker(firstTask);
        worker.thread.start();
        ctl.incrementAndGet();
        return true;


    }

    /**
     * 线程池工作线程包装类
     */
    private final class Worker implements Runnable{
        final Thread thread;
        Runnable firstTask;

        public Worker(Runnable firstTask) {
            this.thread = new Thread(this);
            this.firstTask = firstTask;
        }


        @Override
        public void run() {
            Runnable task = firstTask;
            try {
                while(task!=null || (task=getTask())!=null){
                    task.run();
                    //线程池已经满了，跳出循环
                    if(ctl.get()>maximumPoolSize){
                        break;
                    }
                    task = null;

                }
            } finally {
                //工作线程数增加
                ctl.decrementAndGet();
            }
        }
    }
    /**
     * 从队列中获取任务
     */
    private Runnable getTask(){
        for(;;){
            try {
                System.out.println("workQueue size:"+workQueue.size());
                //获取队列的队头
                return workQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //测试
    public static void main(String[] args) {
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor(2, 2, new ArrayBlockingQueue<>(10));
        for (int i = 0; i < 10; i++) {
            int taskNum = i;
            myThreadPoolExecutor.execute(() -> {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("任务编号："+taskNum);
            });
        }



    }
}
