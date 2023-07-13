package com.lv.java_design_patterns.Easy_Factory;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/12 20:08
 * @description ：有一个园丁，专门负责生产出各种水果,这个就是工厂
 */
public class Gardener {
    public static Fruit getFruit(String fruitPath) throws Exception{
        Class<?> c = Class.forName(fruitPath);
        return (Fruit) c.newInstance();
    }

}
