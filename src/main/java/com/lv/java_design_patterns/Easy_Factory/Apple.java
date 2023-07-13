package com.lv.java_design_patterns.Easy_Factory;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/12 20:06
 * @description ：
 */
public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("Apple.grow()");
    }

    @Override
    public void harvest() {
        System.out.println("Apple.harvest()");
    }

    @Override
    public void plant() {
        System.out.println("Apple.plant()");
    }
}
