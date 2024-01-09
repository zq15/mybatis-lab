package com.zds.mybatis.mapper;

import com.zds.mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    List<User> findAllLazy();

    User findAllByDepartmentId(String departmentId);

    List<User> findAllUseTypeHandler();
}
