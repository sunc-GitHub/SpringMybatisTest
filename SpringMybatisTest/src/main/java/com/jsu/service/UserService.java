package com.jsu.service;

import com.jsu.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:39
 * @Description:
 */
public interface UserService {

    public User getUserById(String id);

    public void updateUser(User user);

    public void saveUser(User user);

    public void deleteUser(User id);

    public List<User> listUser();

    public  List<Map> mapUser();
}
