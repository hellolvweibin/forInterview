package com.lv.spring.mini_ioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/12 09:57
 * @description ：资源加载器
 */
public class ResourceLoader {
    public static Map<String,BeanDefinition> getResource(){
        HashMap<String, BeanDefinition> beanDefinitionMap = new HashMap<>(16);
        Properties properties = new Properties();
        try {
            InputStream inputStream = ResourceLoader.class.getResourceAsStream("/beans.properties");
            properties.load(inputStream);
            Iterator<String> iterator = properties.stringPropertyNames().iterator();
            while(iterator.hasNext()){
                String key = iterator.next();
                String className = properties.getProperty(key);
                BeanDefinition beanDefinition = new BeanDefinition();
                beanDefinition.setBeanName(key);
                Class clazz = Class.forName(className);
                beanDefinition.setBeanClass(clazz);
                beanDefinitionMap.put(key,beanDefinition);
            }
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return beanDefinitionMap;
    }
}
