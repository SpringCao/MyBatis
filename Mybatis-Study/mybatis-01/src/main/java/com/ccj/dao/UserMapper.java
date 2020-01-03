package com.ccj.dao;

import com.ccj.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    void createUser(User user);

    void createUser2(Map<String,Object> map);

    void deleteUserById(int id);

    void updateUserById(User user);
}
