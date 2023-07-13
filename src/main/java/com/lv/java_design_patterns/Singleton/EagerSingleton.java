package com.lv.java_design_patterns.Singleton;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:56
 * @description ：饿汉式
 */
public class EagerSingleton {
    /**
     * 只能有一个实例
     */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 无参构造
     */
    private EagerSingleton(){

    }
    /**
     * 向其他对象提供这一实例的访问
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
