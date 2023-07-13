package test_mybatis;

import com.lv.mybatis.MybatisUtils;
import com.lv.mybatis.dao.UserDao;
import com.lv.mybatis.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/25 14:25
 * @description ：
 */
@Slf4j
public class UserDaoTest {
    @Test
    public void test01() {
        //获得和数据库交互的session对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            log.info("user: {}", user);
        }
        sqlSession.close();


    }

    @Test
    public void test02() {
        //获得和数据库交互的session对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User oneById = userDao.getUserById(1);
        log.info("oneById: {}", oneById);
        sqlSession.close();
    }

    @Test
    public void test03() {
        //获得和数据库交互的session对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getOneByName("张");
        log.info("user: {}", user);
        sqlSession.close();
    }

    @Test
    public void test04() {
        //获得和数据库交互的session对象
        String s = "key";
        HashMap<String, HashMap> map = new HashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "hello world");
        map.put(s, hashMap);
        System.out.println(map.get("key").get("1"));

    }

    @Test
    public void test05() {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o1 >= o2 ? -1 : 1);
        maxHeap.offer(5);
        maxHeap.offer(3);
        maxHeap.offer(4);
        maxHeap.offer(1);
        maxHeap.offer(2);
        while(!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
