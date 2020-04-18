package com.jsu;

import com.jsu.bean.Book;
import com.jsu.dao.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: next door
 * @Date: 2020/3/27 22:01
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws IOException {
        // 获取配置文件
        InputStream inputStream = Resources.getResourceAsStream("com/jsu/config/mybatis-config.xml");

        // 生成工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 使用工厂对象生成sqlsession
        //需要关闭的资源.close(),都写在try(),虚拟机会自动调用session.close()
        try (SqlSession session = sqlSessionFactory.openSession()) {

            // 使用sqlsession获得映射接口的实现类对象,接口的引用指向实现类的对象
            //传入接口.class
            //通过BookMapper.class生成代理类,实现BookMapper接口的代理类
            //代理类能够实现接口的所有方法
            //代理类如何处理sql:mybatis通过反射拿到 com.jsu.bean.Book 限定名
            //限定名和BookMapper.xml的命名空间相对应(namespace)
            //bookMapper中的方法名 等于 bookMapper.xml id
            BookMapper bookMapper = session.getMapper(BookMapper.class);

            bookMapper.getBookById("1");

            bookMapper.saveBook(new Book("2", "黑叔"));

            bookMapper.delete("2");

            bookMapper.update(new Book("1", "黑叔"));

            bookMapper.getBookById("1");

            session.commit();

            System.out.println("执行完毕");
        }

    }
}