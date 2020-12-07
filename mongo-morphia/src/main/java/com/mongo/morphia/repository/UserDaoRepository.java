package com.mongo.morphia.repository;

import com.mongo.morphia.dao.UserDao;
import com.mongo.morphia.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoRepository {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public String addUser(final User user) {
        return userDao.add(user);
    }

    public void deleteAll() {
        userDao.deleteAll();
    }
}
