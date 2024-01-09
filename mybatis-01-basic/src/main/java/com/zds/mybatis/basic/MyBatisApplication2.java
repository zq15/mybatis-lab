package com.zds.mybatis.basic;

import com.zds.mybatis.basic.dao.DepartmentDao;
import com.zds.mybatis.basic.dao.impl.DepartmentDaoImpl;
import com.zds.mybatis.basic.entity.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MyBatisApplication2 {

    public static void main(String[] args) throws Exception {
        InputStream xml = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(xml);

        DepartmentDao departmentDao = new DepartmentDaoImpl(sqlSessionFactory);
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
    }
}

