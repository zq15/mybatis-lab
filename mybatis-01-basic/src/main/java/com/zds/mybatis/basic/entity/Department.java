package com.zds.mybatis.basic.entity;

import lombok.Data;

import java.util.Set;

@Data
public class Department {

    private String id;

    private String name;

    private String tel;

    private Set<User> users;

    // getter setter toString equals hashcode

}

