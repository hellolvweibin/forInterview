package com.lv.spring.mini_ioc;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/12 10:08
 * @description ：对象注册器
 */
public class BeanRegister {
    /**
     * 单例Bean缓存
     */
    private Map<String, Object> singletonMap = new HashMap<>(32);

    /**
     * 获取单例Bean
     *
     * @param beanName bean名称
     */
    public Object getSingletonBean(String beanName) {
        return singletonMap.get(beanName);
    }

    /**
     * 注册单例bean
     *
     * @param beanName
     * @param bean
     */
    public void registerSingletonBean(String beanName, Object bean) {
        if (singletonMap.containsKey(beanName)) {
            return;
        }
        singletonMap.put(beanName, bean);
    }
}
