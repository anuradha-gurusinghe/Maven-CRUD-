package com.usermanagement.dao;

import java.util.List;
import com.usermanagement.bean.User;

public interface UserDao {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void updateUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}
