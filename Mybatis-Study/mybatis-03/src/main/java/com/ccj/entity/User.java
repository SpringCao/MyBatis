package com.ccj.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
@Alias("user")
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
