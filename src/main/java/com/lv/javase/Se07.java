package com.lv.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/5/26 19:08
 * @description ：流
 */
public class Se07 {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //Filter
        System.out.println("Filter");
        stringCollection.stream().filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("Sorted");
        stringCollection.stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("Map");
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // 验证 list 中 string 是否有以 a 开头的, 匹配到第一个，即返回 true
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

// 验证 list 中 string 是否都是以 a 开头的
        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

// 验证 list 中 string 是否都不是以 z 开头的,
        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);      // true


    }
}
