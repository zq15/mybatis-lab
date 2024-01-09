package com.zds.mybatis.transaction.mapper;

import com.zds.mybatis.transaction.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

}
