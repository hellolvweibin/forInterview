package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:51
 * @description ：洗脸
 */
public class WashFaceFilter extends AbstractPrepareFilter{
    public WashFaceFilter(AbstractPrepareFilter nextPrepareFilter){
        super(nextPrepareFilter);
    }
    @Override
    public void prepare(PreparationList preparationList) {
        if(preparationList.isWashFace()){
            System.out.println("洗脸");
        }

    }
}
