package com.lv.java_design_patterns.Chain_Of_Responsibility.upgraded_version;

import com.lv.java_design_patterns.Chain_Of_Responsibility.PreparationList;
import com.lv.java_design_patterns.Chain_Of_Responsibility.Study;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 14:07
 * @description ：
 */
public class FilterChain implements StudyPrepareFilter {

    private int pos = 0;

    private Study study;

    private List<StudyPrepareFilter> studyPrepareFilterList;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter) {
        if (studyPrepareFilterList == null) {
            studyPrepareFilterList = new ArrayList<StudyPrepareFilter>();
        }

        studyPrepareFilterList.add(studyPrepareFilter);
    }

    @Override
    public void doFilter(PreparationList thingList, FilterChain filterChain) {
        // 所有过滤器执行完毕
        if (pos == studyPrepareFilterList.size()) {
            study.study();
        }

        studyPrepareFilterList.get(pos++).doFilter(thingList, filterChain);
    }


}
