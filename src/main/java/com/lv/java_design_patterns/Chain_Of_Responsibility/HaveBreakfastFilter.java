package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:56
 * @description ：吃早餐
 */
public class HaveBreakfastFilter extends AbstractPrepareFilter {

    public HaveBreakfastFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PreparationList preparationList) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }

    }

}
