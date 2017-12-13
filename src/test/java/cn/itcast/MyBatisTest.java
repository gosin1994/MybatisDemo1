package cn.itcast;

import cn.itcast.mybatis.dao.UserDao;
import cn.itcast.mybatis.model.User;
import cn.itcast.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Gosin
 * @Date: 2017/12/12
 */
public class MyBatisTest {
    private SqlSession session;
    private UserDao userDao;

    @Before
    public void init() {
        session = MyBatisUtil.getSession();

        //通过getMapper获得 接口的实现类（动态代理）
        userDao = session.getMapper(UserDao.class);
    }

    /**
     * 动态地理方式 增加用户
     */
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserage(29);
        user.setUsername("刘星");

        userDao.addUser(user);
        session.commit();
        session.close();
    }

    /**
     * 动态代理方式 删除用户
     */
    @Test
    public void testDeleteUserById() {
        User user = new User();
        user.setUserid(14);
        userDao.deleteUserById(user);
        session.commit();
        session.close();
    }
    /**
     * 动态代理方式 修改用户信息
     */
    @Test
    public void testModifyUser() {
        User user = new User();
        user.setUsername("花木兰");
        user.setUserid(11);
        user.setUserage(44);
        userDao.modifyUser(user);
        session.commit();
        session.close();
    }
    /**
     * 动态代理方式 查询单个用户信息
     */
    @Test
    public void testGetUserById() {
        User user = new User();
        user.setUserid(15);
        User u = userDao.getUserById(user);
        System.out.println(u);
        session.commit();
        session.close();
    }
    /**
     * 动态代理方式 查询所有用户
     */
    @Test
    public void testGetAllUser() {
        List<User> allUser = userDao.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }


  /*  private UserDao userDao = new UserDaoImpl();

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserage(29);
        user.setUsername("包拯");

        userDao.addUser(user);
    }*/



}
