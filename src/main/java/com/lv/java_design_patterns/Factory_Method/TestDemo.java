package com.lv.java_design_patterns.Factory_Method;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/13 13:36
 * @description ：
 */
public class TestDemo {
    public static void main(String[] args) {
        String data  = "";
        ExportHtmlFactory exportHtmlFactory = new ExportHtmlFactory();
        ExportFile exportFile = exportHtmlFactory.factory("financial");
        exportFile.export(data);

    }
}
