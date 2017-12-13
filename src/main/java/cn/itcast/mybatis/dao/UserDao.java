package cn.itcast.mybatis.dao;

import cn.itcast.mybatis.model.User;

import java.util.List;

/**
 * @Author: Gosin
 * @Date: 2017/12/13 17:42
 */
public interface UserDao {
    public void addUser(User user);
    public void deleteUserById(User user);
    public void modifyUser(User user);
    public User getUserById(User user);
    public List<User> getAllUser();

}
