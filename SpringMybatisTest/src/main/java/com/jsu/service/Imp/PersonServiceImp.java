package com.jsu.service.Imp;

import com.jsu.bean.Person;
import com.jsu.bean.User;
import com.jsu.dao.PersonMapper;
import com.jsu.dao.UserMapper;
import com.jsu.service.PersonService;
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
@Service("personService")
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonMapper personMapper;


    @Override
    public Person listPerson(){
        return personMapper.listPerson();
    }




}
