package com.lv.java_design_patterns.Proxy;


import java.util.ArrayList;
import java.util.List;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 12:28
 * @description ：NginxProxy
 */
public class NginxProxy implements Server{
    /**
     * 新浪服务器列表
     */
    private final List<String> sinaServerAddresses = new ArrayList<>();


    @Override
    public String getPageTitle(String url) {
        return null;
    }
}
