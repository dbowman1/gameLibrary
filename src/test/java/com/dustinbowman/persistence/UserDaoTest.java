package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.Role;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.hibernate.Hibernate;
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
    public void testInsertWithRole() {
        int insertedUser = 0;
        User user = new User();
        user.setUserName("testUserName");
        user.setPassword("notarealpass");
        user.setEmail("notanemail@mail.com");

        Role role = new Role();
        role.setRole("admin");
        role.setUser(user);

        user.addRole(role);

        insertedUser = dao.insert(user);
        User retrievedUser = (User) dao.getById(insertedUser);
        assertTrue(insertedUser > 0);
        assertEquals(user, retrievedUser);
        assertEquals(1, retrievedUser.getRoles().size());
        assertTrue(retrievedUser.getRoles().contains(role));
    }

    @Test
    public void testAddGameWithUser() {
        User user = new User();
        user.setUserName("Gandalf");
        user.setEmail("takinghobbitstoisengar");
        user.setPassword("password Yo");

        Game game = new Game();
        game.setTitle("Harry Potter");
        game.setDescription("not a good game");

        int gameId = 0;
        GenericDao gameDao = new GenericDao(Game.class);
        gameId = gameDao.insert(game);
        Game retrievedGame = (Game) gameDao.getById(gameId);
        assertEquals(retrievedGame, game);

        user.getGames().add(game);
        game.getUsers().add(user);

        user.getGames();



    }
}
