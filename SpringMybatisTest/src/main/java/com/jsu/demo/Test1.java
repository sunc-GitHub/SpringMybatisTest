package com.jsu.demo;

import com.jsu.bean.Person;
import com.jsu.bean.User;
import com.jsu.controller.UserController;
import com.jsu.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Auther: next door
 * @Date: 2020/3/29 18:06
 * @Description:一对一查询
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext path = new ClassPathXmlApplicationContext("com/jsu/config/applicationContext.xml");

        PersonService personController = (PersonService) path.getBean("personService");

        Person person = personController.listPerson();

        System.out.println(person);

    }
}
