package com.ccj.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias("teacher")
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
