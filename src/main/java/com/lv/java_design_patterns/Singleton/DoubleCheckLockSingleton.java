package com.lv.java_design_patterns.Singleton;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 14:13
 * @description ：双检锁
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton instance = null;

    public DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
