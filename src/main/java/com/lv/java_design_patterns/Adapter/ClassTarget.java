package com.lv.java_design_patterns.Adapter;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/16 12:42
 * @description ：目标角色
 */
public interface ClassTarget {
    /** 这是源类ClassAdaptee也有的方法 */
    public void sampleOperation1();

    /** 这是源类ClassAdaptee没有的方法 */
    public void sampleOperation2();
}
