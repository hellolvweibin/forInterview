package com.lv.java_design_patterns.Strategy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/14 13:41
 * @description ：策略A
 */
public class StrategyA implements Strategy{

    @Override
    public void useStrategy() {
        System.out.println("StrategyA.useStrategy()");
    }
}
