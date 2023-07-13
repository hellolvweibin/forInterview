package com.lv.java_design_patterns.Singleton;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 14:08
 * @description ：懒汉式
 */
public class LazySingleton {
    /**
     * 先声明，不初始化
     */
    private static LazySingleton instance = null;

    /**
     * 构造方法
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
