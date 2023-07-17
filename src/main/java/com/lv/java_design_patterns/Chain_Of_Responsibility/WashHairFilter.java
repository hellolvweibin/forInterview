package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:54
 * @description ：洗头
 */
public class WashHairFilter extends AbstractPrepareFilter{
    public WashHairFilter(AbstractPrepareFilter nextPrepareFilter){
        super(nextPrepareFilter);
    }
    @Override
    public void prepare(PreparationList preparationList) {
        if(preparationList.isWashHair()){
            System.out.println("洗头");
        }
    }
}
