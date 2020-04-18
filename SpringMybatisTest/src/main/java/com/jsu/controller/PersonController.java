package com.jsu.controller;

import com.jsu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * @Auther: next door
 * @Date: 2020/3/29 17:39
 * @Description:
 */
@Controller("personController")
public class PersonController {


    @Autowired
    private PersonService personService;



}
