package com.dustinbowman.persistence;

import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    GenericDao dao;
    List<User> users;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(User.class);
        users = dao.getAll();
    }

    @Test
    public void deleteUser() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }
    @Test
    public void getAllUsersSuccess() {
        assertEquals(3, users.size());
    }

    @Test
    public void testDeleteUser() {
        int sizeBeforeDelete = dao.getAll().size();
        User userDeleted = users.get(0);
        int id = userDeleted.getId();
        dao.delete(userDeleted);
        int sizeAfterDelete = dao.getAll().size();

        User deletedUser = (User) dao.getById(id);

        assertEquals(sizeBeforeDelete -1 , sizeAfterDelete);
        assertNull(deletedUser);
    }

    @Test
    public void testUpdateUser() {
        User user = users.get(0);
        int id = user.getId();
        String updateValue = LocalDate.now().toString();
        String userNameBeforeUpdate = user.getUserName();
        String userEmailBeforeUpdate = user.getEmail();
        String userPassBeforeUpdate = user.getPassword();

        user.setEmail(userEmailBeforeUpdate + updateValue);
        user.setPassword(userPassBeforeUpdate + updateValue);
        user.setUserName(userNameBeforeUpdate + updateValue);

        dao.saveOrUpdate(user);

        User updatedUser = (User) dao.getById(id);
        assertEquals(user, updatedUser);
    }

    @Test
    public void testInsert() {
        int insertedUser = 0;
        User user = new User();
        insertedUser = dao.insert(user);
        User retrievedUser = (User) dao.getById(insertedUser);
        assertTrue(insertedUser > 0);
        assertEquals(user, retrievedUser);

    }

}
