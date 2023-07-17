package com.lv.java_design_patterns.Proxy;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/7/17 11:59
 * @description ：新浪服务器
 */
public class SinaServer implements Server{
    @Override
    public String getPageTitle(String url) {
        if ("http://www.sina.com.cn/".equals(url)) {
            return "新浪首页";
        } else if ("http://http://sports.sina.com.cn/".equals(url)) {
            return "新浪体育_新浪网";
        }

        return "无页面标题";
    }
}
