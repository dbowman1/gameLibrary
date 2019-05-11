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

/**
 * The type Users db test.
 */
public class UsersDBTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Users db.
     */
    UsersDB usersDB;
    /**
     * The Dao.
     */
    GenericDao dao;
    /**
     * The Users.
     */
    List<User> users;
    /**
     * The User.
     */
    User user;

    /**
     * Sets up.
     */
    @BeforeEach
    public void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(User.class);
        users = dao.getAll();
        usersDB = new UsersDB();
        user = users.get(0);
    }

    /**
     * Test save or update user.
     */
    @Test
    public void testSaveOrUpdateUser() {
        assertEquals("email", user.getEmail());
        user.setEmail("Testsomething");
        usersDB.saveOrUpdateUser(user);
        assertEquals("Testsomething", user.getEmail());
    }

    /**
     * Test get list of user.
     */
    @Test
    public void testGetListOfUser() {
        List<User> users = usersDB.getListOfUser("username");
        assertEquals(1, users.size());
    }

    /**
     * Test user from string property.
     */
    @Test
    public void testUserFromStringProperty() {
        User testUser = usersDB.userFromStringProperty("username");
        assertEquals(user, testUser);
    }

    /**
     * Test get user from req.
     */
    @Test
    public void testGetUserFromReq() {
        User testUser = usersDB.getUserFromReq("username");
        assertEquals(user, testUser);
    }

}
