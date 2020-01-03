package com.ccj.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("teacher")
public class Teacher {
    private int id;
    private String name;
}
