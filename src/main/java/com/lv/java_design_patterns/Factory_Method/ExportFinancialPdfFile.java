package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:32
 * @description ：导出财务版PDF文件
 */
public class ExportFinancialPdfFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版PDF文件");
        return true;
    }
}
