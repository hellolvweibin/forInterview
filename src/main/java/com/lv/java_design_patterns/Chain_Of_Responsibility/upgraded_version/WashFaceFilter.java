package com.lv.java_design_patterns.Chain_Of_Responsibility.upgraded_version;

import com.lv.java_design_patterns.Chain_Of_Responsibility.PreparationList;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 14:15
 * @description ：
 */
public class WashFaceFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isWashFace()) {
            System.out.println("洗完脸");
        }

        filterChain.doFilter(preparationList, filterChain);
    }

}
