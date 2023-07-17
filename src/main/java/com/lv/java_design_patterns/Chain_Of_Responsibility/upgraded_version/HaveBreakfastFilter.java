package com.lv.java_design_patterns.Chain_Of_Responsibility.upgraded_version;

import com.lv.java_design_patterns.Chain_Of_Responsibility.PreparationList;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 14:15
 * @description ：
 */
public class HaveBreakfastFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isHaveBreakfast()) {
            System.out.println("吃完早饭");
        }

        filterChain.doFilter(preparationList, filterChain);
    }

}
