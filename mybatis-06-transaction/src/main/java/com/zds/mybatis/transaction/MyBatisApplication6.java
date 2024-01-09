package com.zds.mybatis.transaction;


import com.zds.mybatis.transaction.entity.Department;
import com.zds.mybatis.transaction.mapper.DepartmentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisApplication6 {

    public static void main(String[] args) throws Exception {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

        Department department = departmentMapper.findById("11c8cdec37e041cf8476c86d46a42dd3");
        department.setName("测测试试");

        departmentMapper.update(department);

        departmentMapper.deleteById("11c8cdec37e041cf8476c86d46a42dd3");

        sqlSession.commit();
        sqlSession.close();

    }

}

