package com.lv.javase;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：范型方法
 */
public class Se06 {
    public static <E> void printArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray  );
    }

}
