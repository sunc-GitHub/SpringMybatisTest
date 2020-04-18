package com.jsu.demo;

import com.jsu.bean.Card;
import com.jsu.bean.Person;
import com.jsu.dao.CardMapper;
import com.jsu.dao.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: next door
 * @Date: 2020/3/29 18:06
 * @Description:一对一查询
 */
public class Test2 {
    public static void main(String[] args) {

        String resource = "com/jsu/config/sqlMapperConfig.xml";

        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {

            PersonMapper mapper = session.getMapper(PersonMapper.class);

            Person person = mapper.getPersonInsteps(1);

            System.out.println(person);

        }

    }
}
