package com.lv.java_aop.day03;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/15 13:41
 * @description ：动态代理工厂
 */
@Slf4j
public class ProxyFactory implements MethodInterceptor {

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
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回掉函数
        enhancer.setCallback((Callback) this);
        //创建子类对象代理
        return enhancer.create();

    }



    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("请问有什么可以帮到您？");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        log.info("问题已经解决");
        return returnValue;
    }
}
