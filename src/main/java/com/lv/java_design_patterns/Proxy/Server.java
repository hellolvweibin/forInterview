package com.lv.java_design_patterns.Proxy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 11:58
 * @description ：服务器接口，用于获取网站数据
 */
public interface Server {
    /**
     * 根据url获取页面标题
     */
    public String getPageTitle(String url);
}
