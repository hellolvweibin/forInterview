package com.lv.java_design_patterns.Chain_Of_Responsibility.upgraded_version;

import com.lv.java_design_patterns.Chain_Of_Responsibility.PreparationList;
import com.lv.java_design_patterns.Chain_Of_Responsibility.Study;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 14:16
 * @description ：
 */
public class TestResponsibilityAdvance {
    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(false);
        preparationList.setHaveBreakfast(true);

        Study study = new Study();
        StudyPrepareFilter washHairFilter = new WashHairFilter();
        StudyPrepareFilter washFaceFilter = new WashFaceFilter();
        StudyPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter();
        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFaceFilter);
        filterChain.addFilter(washHairFilter);
        filterChain.addFilter(haveBreakfastFilter);

        filterChain.doFilter(preparationList,filterChain);



    }
}
