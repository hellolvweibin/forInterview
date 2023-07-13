package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:35
 * @description ：具体的PDF导出工厂
 */
public class ExportPdfFactory implements ExportFactory{
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
