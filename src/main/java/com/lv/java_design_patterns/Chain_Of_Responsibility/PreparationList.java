package com.lv.java_design_patterns.Chain_Of_Responsibility;

import lombok.Data;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:35
 * @description ：上学清单
 */
@Data
public class PreparationList {
    /**
     * 是否洗脸
     */
    private boolean washFace;

    /**
     * 是否洗头
     */
    private boolean washHair;

    /**
     * 是否吃早餐
     */
    private boolean haveBreakfast;

}
