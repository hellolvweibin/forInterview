package com.lv.java_design_patterns.Easy_Factory;

public class Grape implements Fruit {
    public void grow() {
        System.out.println("Grape.grow()");
    }

    public void harvest() {
        System.out.println("Grape.harvest()");
    }

    public void plant() {
        System.out.println("Grape.plant()");
    }
}
