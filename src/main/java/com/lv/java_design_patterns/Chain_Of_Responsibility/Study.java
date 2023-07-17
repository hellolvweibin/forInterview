package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:39
 * @description ：留一个抽象方法prepare给子类去实现，在抽象类中持有下一个对象的引用nextPrepareFilter，如果有，则执行；如果没有表示链上所有对象都执行完毕，执行Study类的study()方法：
 */
public class Study {
    public void study(){

        System.out.println("我可以去上学了！");
    }
}
