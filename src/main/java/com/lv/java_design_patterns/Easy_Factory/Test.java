package com.lv.java_design_patterns.Easy_Factory;

import java.util.Deque;
import java.util.Stack;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/12 20:11
 * @description ：想要什么水果就问园丁拿就好了
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Fruit fruit0 = Gardener.getFruit("com.lv.java_design_patterns.Easy_Factory.Apple");
        fruit0.grow();
        Fruit fruit1 = Gardener.getFruit("com.lv.java_design_patterns.Easy_Factory.Grape");
        fruit1.harvest();
        Stack<Integer> integers = new Stack<>();

    }
}
