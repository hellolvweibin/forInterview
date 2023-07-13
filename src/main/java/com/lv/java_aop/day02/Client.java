package com.lv.java_aop.day02;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/15 13:32
 * @description ：客户端
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        //问题方
        ISolver solver = new Solver();
        //代理：客服
        ISolver csProxy = (ISolver) new ProxyFactory(solver).getProxyInstance();
        //目标方法：解决问题
        csProxy.solve();


    }
}
