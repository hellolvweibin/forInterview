package com.lv.javase;

import java.util.Optional;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/5/26 17:04
 * @description ：
 */
public class T1 {
    public static void main(String[] args) {
        Student student = new Student();
        Optional<String> optional = Optional.of("bam");
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

    }
}
