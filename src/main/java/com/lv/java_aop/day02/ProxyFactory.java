package com.lv.java_aop.day02;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/15 13:16
 * @description ：代理工厂
 */
@Slf4j
public class ProxyFactory {
    /**
     * 维护一个目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 为目标对象生成代理对象
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("请问有什么可以帮到您？");
                        //调用目标对象方法
                        Object returnValue = method.invoke(target, args);
                        log.info("问题解决");
                        return null;
                    }
                });
    }
}
