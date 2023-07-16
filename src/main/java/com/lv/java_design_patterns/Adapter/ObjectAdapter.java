package com.lv.java_design_patterns.Adapter;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/16 12:51
 * @description ：和类适配器不同的是，对象适配器采用了委派关系将源角色与适配器角色关联
 */
public class ObjectAdapter {
    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee objectAdaptee) {
        this.objectAdaptee = objectAdaptee;
    }
    public void sampleOperation1(){
        this.objectAdaptee.sampleOperation1();
    }
    public void sampleOperation2(){}
}
