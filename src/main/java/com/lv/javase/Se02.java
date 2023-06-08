package com.lv.javase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Se02 {
    private String no;
    private String name;
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Se02)){
            return false;
        }
        Se02 person = (Se02) obj;
        return Objects.equals(no,person.no) && Objects.equals(name,person.name);

    }
    @Override
    public int hashCode() {
        return Objects.hash(no,name);
    }
}
