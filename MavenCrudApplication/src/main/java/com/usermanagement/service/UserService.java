package com.usermanagement.service;

import com.usermanagement.bean.User;
import java.util.List;
//import org.springframework.data.domain.Page;

public interface UserService {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUser(int id);
    public List<User> getAllUser();
}