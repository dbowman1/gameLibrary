package com.dustinbowman.utilities;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import java.util.List;

/**
 * The type Users db.
 */
public class UsersDB {
    /**
     * Save or update user.
     *
     * @param user the user
     */
    public void saveOrUpdateUser(User user) {
        GenericDao dao = new GenericDao(User.class);
        dao.saveOrUpdate(user);
    }

    /**
     * Gets list of user.
     *
     * @param userName the user name
     * @return the list of user
     */
    public List<User> getListOfUser(String userName) {
        GenericDao dao = new GenericDao(User.class);
        return dao.findByPropertyEqual("userName", userName);
    }

    /**
     * User from string property user.
     *
     * @param userString the user string
     * @return the user
     */
    public User userFromStringProperty(String userString) {
        GenericDao dao = new GenericDao(User.class);
        List<User> users = dao.findByPropertyEqual("userName", userString);
        return users.get(0);
    }


    /**
     * Gets user from req.
     *
     * @param userName the user name
     * @return the user from req
     */
    public User getUserFromReq(String userName) {
        GenericDao dao = new GenericDao(User.class);
        List<User> users = dao.findByPropertyEqual("userName", userName);
        return users.get(0);
    }

}
