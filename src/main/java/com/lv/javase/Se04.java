package com.lv.javase;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：Integer
 */
@Slf4j
public class Se04 {
    public static void main(String[] args) {
        String s = "100";
        int i = 200;
        System.out.println(Integer.valueOf(s));
        System.out.println(Integer.parseInt(s));
        System.out.println(String.valueOf(200));
    }
}
