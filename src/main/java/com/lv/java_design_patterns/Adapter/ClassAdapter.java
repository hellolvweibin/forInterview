package com.lv.java_design_patterns.Adapter;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/16 12:45
 * @description ：适配器角色扩展了ClassAdaptee，同时又实现了目标接口。由于ClassAdaptee没有提供sampleOperation()2方法，而目标接口又要求这个方法，因此适配器角色实现了这个方法
 */
public class ClassAdapter extends ClassAdaptee implements ClassTarget{
    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
