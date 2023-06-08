package com.lv.javase;

import lombok.extern.slf4j.Slf4j;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：
 */
@Slf4j
public class Se03 extends Order{
    public static void main(String[] args) {
        String a = "hello ";
        String b = "world!";
        String ab = a + b;
        log.info("ab{},a+b{},相等？{}",ab,a+b,a+b == ab);

    }
}
