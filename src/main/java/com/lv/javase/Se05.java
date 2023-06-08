package com.lv.javase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：范型
 */
public class Se05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        //list.add("a");报错
        Class<? extends ArrayList> clazz = list.getClass();
        //第一个参数name 是要获得的方法的名字 第二个参数 parameterTypes 是按声明顺序标识该方法的形参类型
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //通过反射添加，invoke执行实例
        add.invoke(list, "a");
        System.out.println(list);
    }
}
