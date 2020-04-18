package com.jsu.demo;

import com.jsu.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: next door
 * @Date: 2020/3/29 18:06
 * @Description:简单的增删改查
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext path = new ClassPathXmlApplicationContext("com/jsu/config/applicationContext.xml");

        UserController userController = (UserController) path.getBean("userController");

        //userController.saveUser(new User(null, "李白"));

        //List<User> users = userController.listUser();

        /*@FunctionalInterface*/
       /* users.stream().forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
               System.out.println(user);
            }
        });*/

        /*lambada表达式*/
       /* users.stream().forEach((User user)->{
            System.out.println(user);
        });*/

        List<Map> listMap = userController.mapUser();

        for (Map<String, Object> map : listMap) {
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                System.out.println(entry.getKey()+"\t" + entry.getValue());
            }
        }



       /* userController.updateUser(new User("1","周"));

        userController.getUserById("1");

        userController.deleteUser(new User("1",null));*/
    }
}
