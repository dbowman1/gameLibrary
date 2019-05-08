package com.dustinbowman.utilities;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import java.util.List;

public class UsersDB {
    public void saveOrUpdateUser(User user) {
        GenericDao dao = new GenericDao(User.class);
        dao.saveOrUpdate(user);
    }

    public List<User> getListOfUser(String userName) {
        GenericDao dao = new GenericDao(User.class);
        return dao.findByPropertyEqual("userName", userName);
    }

    public User userFromStringProperty(String userString) {
        GenericDao dao = new GenericDao(User.class);
        List<User> users = dao.findByPropertyEqual("userName", userString);
        return users.get(0);
    }


    public User getUserFromReq(String userName) {
        GenericDao dao = new GenericDao(User.class);
        List<User> users = dao.findByPropertyEqual("userName", userName);
        return users.get(0);
    }

}
