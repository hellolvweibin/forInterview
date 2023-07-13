package com.lv.mybatis.dao;

import com.lv.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/25 14:19
 * @description ：
 */
public interface UserDao {
    /**
     * 获得所有的用户
     * @return List
     */
    List<User> getUserList();

    /**
     * 根据Id获得用户
     * @return User
     */
    User getUserById(@Param("id") int id);

    User getOneByName(String name);
}
