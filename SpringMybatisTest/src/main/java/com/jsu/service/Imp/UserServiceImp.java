package com.jsu.service.Imp;

import com.jsu.bean.User;
import com.jsu.dao.UserMapper;
import com.jsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:39
 * @Description:
 */
@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public void deleteUser(User id) {
        userMapper.deleteUser(id);
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public List<Map>mapUser() {
        return userMapper.mapUser();
    }


}
