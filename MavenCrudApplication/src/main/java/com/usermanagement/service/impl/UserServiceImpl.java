package com.usermanagement.service.impl;

import com.usermanagement.bean.User;
import com.usermanagement.dao.UserDao;
import com.usermanagement.dao.impl.UserDaoImpl;
import com.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoImpl userDao;
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void saveUser(User user) {
        this.userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        this.userDao.deleteUser(id);
    }

    @Override
    public User getUser(int id) {
        return this.userDao.getUser(id);
    }

    @Override
    public List<User> getAllUser() {
        return this.userDao.getAllUser();
    }


//    @Transactional
//    @Override
//    public void saveUser(User user) {
//        UserDaoImpl.saveUser(user);
//    }
//
//    @Transactional
//    @Override
//    public List<User> getAllUser() {
//        return userDao.getAllUser();
//    }
//
//    @Transactional
//    @Override
//    public User getUser(int id) {
//        return userDao.getUser(id);
//    }
//
//    @Transactional
//    @Override
//    public void deleteUser(int id) {
//        userDao.deleteUser(id);
//    }


}
