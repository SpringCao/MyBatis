package com.ccj.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("student")
public class Student {
    private int id;
    private String name;
    private int tid;
}
