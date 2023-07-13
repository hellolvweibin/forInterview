package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:26
 * @description ：导出Html的工厂
 */
public class ExportHtmlFactory implements ExportFactory{
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            return new ExportStandardHtmlFile();
        }
        if("financial".equals(type)){
            return new ExportFinancialHtmlFile();
        }
        return null;
    }
}
