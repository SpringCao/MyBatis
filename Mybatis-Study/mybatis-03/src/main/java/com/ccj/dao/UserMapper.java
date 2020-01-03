package com.ccj.dao;

import com.ccj.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    //方法存在多个参数，所有的参数前面必须加上@Param注解
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    void createUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUserById(@Param("id") int id);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    void updateUserById(User user);
}
