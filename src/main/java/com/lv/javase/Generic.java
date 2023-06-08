package com.lv.javase;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：
 */
public class Generic <T>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }
    public T getKey(){
        return key;
    }
}
