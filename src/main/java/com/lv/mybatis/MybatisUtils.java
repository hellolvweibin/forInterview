package com.lv.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/25 14:16
 * @description ：
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        try {
            //使用MyBatis第一步，获取sqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 现在您有了 SqlSessionFactory，顾名思义，您可以获取 SqlSession 的实例。SqlSession 包含对数据库执行 SQL 命令所需的所有方法。
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
