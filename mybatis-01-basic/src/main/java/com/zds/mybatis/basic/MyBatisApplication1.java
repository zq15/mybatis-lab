package com.zds.mybatis.basic;

import com.zds.mybatis.basic.entity.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisApplication1 {

    public static void main(String[] args) throws IOException {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Department> departmentList = sqlSession.selectList("departmentMapper.findAll");
        departmentList.forEach(System.out::println);
    }
}
