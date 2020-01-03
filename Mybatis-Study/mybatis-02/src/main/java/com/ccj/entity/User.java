package com.ccj.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
@Alias("user")
public class User {
    private int id;
    private String name;
    private String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
