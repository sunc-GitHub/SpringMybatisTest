package com.jsu.dao;

import com.jsu.bean.Person;
import org.springframework.stereotype.Repository;

/**
 * @Auther: next door
 * @Date: 2020/3/29 17:10
 * @Description:
 */
@Repository()
public interface PersonMapper {

    Person getPersonInsteps(int id);

    Person listPerson();

}
