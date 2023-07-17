package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:56
 * @description ：测试
 */
public class TestResponsibility {
    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(false);
        preparationList.setHaveBreakfast(true);

        Study study = new Study();
        //当前对象有下一个对象的引用
        AbstractPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter(null);
        AbstractPrepareFilter washFaceFilter = new WashFaceFilter(haveBreakfastFilter);
        AbstractPrepareFilter washHairFilter = new WashHairFilter(washFaceFilter);
        washHairFilter.doFilter(preparationList,study);


    }
}
