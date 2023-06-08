package com.lv.javase;


import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：自动类型转换
 */
@Slf4j
public class Se01 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0;i < 100;i++)
        {
            count = ++count;
        }
        System.out.println("count = "+count);


    }
}
