package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:28
 * @description ：具体产品角色，导出标准PDF文件
 */
public class ExportStandardPdfFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("导出标准PDF文件");
        return true;
    }
}
