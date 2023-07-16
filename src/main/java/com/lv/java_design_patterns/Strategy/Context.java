package com.lv.java_design_patterns.Strategy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/14 13:43
 * @description ：持有策略引用的类
 */
public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod(){
        strategy.useStrategy();
    }
}
