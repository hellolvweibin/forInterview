package com.lv.java_design_patterns.Chain_Of_Responsibility;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 13:46
 * @description ：抽象过滤器
 */
public abstract class AbstractPrepareFilter {
    private AbstractPrepareFilter nextPrepareFilter;

    public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
    }
    public void doFilter(PreparationList preparationList,Study study){
        prepare(preparationList);
        if(nextPrepareFilter == null){
            study.study();
        }else{
            nextPrepareFilter.doFilter(preparationList,study);
        }

    }
    public abstract void prepare(PreparationList preparationList);

}
