package com.lv.java_design_patterns.Prototype;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 15:57
 * @description ：Client
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        for (int i = 0; i < 5; i++) {
            ConcretePrototype clone = (ConcretePrototype)prototype.clone();
            clone.show();
        }
    }
}
