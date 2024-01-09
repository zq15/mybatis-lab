package com.zds.mybatis.basic.mapper;

import com.zds.mybatis.basic.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    List<User> findAllLazy();

    User findAllByDepartmentId(String departmentId);
}
