package com.lv.javahashmap;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/1 14:41
 * @description ：
 */
@Slf4j
public class Map01 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, String> map = new TreeMap<>();
        map.put(1,"语文");
        map.put(2,"数学");
        map.put(3,"英语");
        map.put(4,"政治");
        map.put(5,"历史");
        map.put(6,"地理");
        map.put(7,"生物");
        map.put(8,"化学");
        for (Integer integer : map.keySet()) {
            log.info(map.get(integer));
        }

    }
}
