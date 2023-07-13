package com.lv.java_design_patterns.Prototype;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 15:47
 * @description ：抽象原型角色
 */
public  abstract class Prototype implements Cloneable{
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
    public abstract void show();
}
