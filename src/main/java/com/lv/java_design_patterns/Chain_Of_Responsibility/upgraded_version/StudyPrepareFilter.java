package com.lv.java_design_patterns.Chain_Of_Responsibility.upgraded_version;

import com.lv.java_design_patterns.Chain_Of_Responsibility.PreparationList;


/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 14:05
 * @description ：抽象一个Filter
 */
public interface StudyPrepareFilter {
    public void doFilter(PreparationList preparationList, FilterChain filterChain);

}
