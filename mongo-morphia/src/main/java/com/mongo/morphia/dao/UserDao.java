package com.mongo.morphia.dao;

import com.mongo.morphia.domain.AbstractBaseDao;
import com.mongo.morphia.domain.User;
import org.springframework.stereotype.Repository;
import xyz.morphia.Key;

import java.util.List;

@Repository
public class UserDao extends AbstractBaseDao {

    public List<User> getAllUsers() {
        List<User> users = ds.find(User.class).asList();
        return users;
    }

    public String add(User user) {
        Key<User> userKey = ds.save(user);
        return (String) userKey.getId();
    }

    public void deleteAll() {
        ds.delete(ds.createQuery(User.class)).wasAcknowledged();
    }
}
