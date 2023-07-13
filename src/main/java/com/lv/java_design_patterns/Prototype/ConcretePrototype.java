package com.lv.java_design_patterns.Prototype;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 15:52
 * @description ：具体原型角色
 */
public class ConcretePrototype extends Prototype{


    @Override
    public void show() {
        System.out.println("ConcretePrototype.show()");
    }
}
