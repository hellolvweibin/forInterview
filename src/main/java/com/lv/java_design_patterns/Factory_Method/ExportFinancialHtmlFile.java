package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:30
 * @description ：导出财务版Html文件
 */
public class ExportFinancialHtmlFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版HTML文件");
        return true;
    }
}
