package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:18
 * @description ：导出文件的工厂
 */
public interface ExportFactory {
    public ExportFile factory(String type);
}
