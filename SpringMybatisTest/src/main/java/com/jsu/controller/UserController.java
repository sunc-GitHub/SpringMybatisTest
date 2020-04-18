package com.jsu.controller;

import com.jsu.bean.User;
import com.jsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:39
 * @Description:
 */
@Controller("userController")
public class UserController {

    @Autowired
    private UserService userService;

    public void saveUser(User user){
        userService.saveUser(user);
    }

    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    public void updateUser(User user){
        userService.updateUser(user);
    }

    public void getUserById(String id){
        userService.getUserById(id);
    }

    public List<User> listUser(){return userService.listUser();} ;

    public  List<Map>mapUser(){
        return userService.mapUser();
    }
}
