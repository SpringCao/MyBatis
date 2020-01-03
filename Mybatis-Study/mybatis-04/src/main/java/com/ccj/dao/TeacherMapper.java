package com.ccj.dao;

import com.ccj.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    Teacher getTeacherById(@Param("id") int id);
}
