package com.zds.mybatis.basic.dao;

import com.zds.mybatis.basic.entity.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department> findAll();

    Department findById(String id);
}

