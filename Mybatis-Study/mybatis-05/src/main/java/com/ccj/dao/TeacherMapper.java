package com.ccj.dao;


import com.ccj.entity.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    Teacher getTeacher(@Param("id") int id);
}
