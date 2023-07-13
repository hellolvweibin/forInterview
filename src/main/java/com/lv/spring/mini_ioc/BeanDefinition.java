package com.lv.spring.mini_ioc;

import lombok.Data;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/12 09:55
 * @description ：bean 定义类，配置文件中 bean 定义对应的实体
 */
@Data
public class BeanDefinition {
    private String beanName;
    private Class beanClass;
}
