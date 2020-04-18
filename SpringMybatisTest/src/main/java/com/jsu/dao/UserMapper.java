package com.jsu.dao;

import com.jsu.bean.User;

import java.security.Key;
import java.util.List;
import java.util.Map;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:10
 * @Description:
 */
public interface UserMapper {

    public User getUserById(String id);

    public void updateUser(User user);

    public void saveUser(User user);

    public void deleteUser(User id);

    public List<User> listUser();

    public List<Map> mapUser();
}
