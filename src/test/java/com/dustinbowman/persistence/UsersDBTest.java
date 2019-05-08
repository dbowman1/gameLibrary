package com.dustinbowman.persistence;

import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import com.dustinbowman.utilities.UsersDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersDBTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    UsersDB usersDB;
    GenericDao dao;
    List<User> users;
    User user;

    @BeforeEach
    public void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(User.class);
        users = dao.getAll();
        usersDB = new UsersDB();
        user = users.get(0);
    }

    @Test
    public void testSaveOrUpdateUser() {
        assertEquals("email", user.getEmail());
        user.setEmail("Testsomething");
        usersDB.saveOrUpdateUser(user);
        assertEquals("Testsomething", user.getEmail());
    }

    @Test
    public void testGetListOfUser() {
        List<User> users = usersDB.getListOfUser("username");
        assertEquals(1, users.size());
    }

    @Test
    public void testUserFromStringProperty() {
        User testUser = usersDB.userFromStringProperty("username");
        assertEquals(user, testUser);
    }

    @Test
    public void testGetUserFromReq() {
        User testUser = usersDB.getUserFromReq("username");
        assertEquals(user, testUser);
    }

}
