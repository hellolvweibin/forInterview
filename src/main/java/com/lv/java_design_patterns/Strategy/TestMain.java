package com.lv.java_design_patterns.Strategy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/14 13:46
 * @description ：调用该类的地方可以自行决定使用哪个类
 */
public class TestMain {
    public static void main(String[] args) {
        StrategyA strategyA = new StrategyA();
        StrategyB strategyB = new StrategyB();
        Context context = new Context(strategyA);
        context.strategyMethod();
        context = new Context(strategyB);
        context.strategyMethod();
    }
}
