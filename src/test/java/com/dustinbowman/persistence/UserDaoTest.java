package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.Role;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private static SessionFactory sessionFactory;
    private Session session;
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
        assertTrue(users.size() > 0);
        assertEquals(3, users.size());
        assertFalse(users.get(0).getUserName().equals(""));
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
        user.setUserName("gandalfTheWhite");
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
        logger.debug(retrievedUser.getRoles());
    }

    @Test
    public void testAddGameToUser() {
        User user = users.get(0);
        GenericDao gDao = new GenericDao(Game.class);

        for(int i = 0; i < 5; i ++) {
            Game game = new Game();
            game.setGameId(i);
            user.addGame(game);
            gDao.insert(game);
            assertTrue(gDao.getAll().size() > 0);
        }

        dao.saveOrUpdate(user);
        assertEquals(6, user.getGames().size());
    }

    @Test
    public void testRemoveGameFromUser() {
        User user = users.get(0);
        GenericDao gDao = new GenericDao(Game.class);

        int gameId = 1;
        Game retrievedGame = (Game)gDao.getById(gameId);

        logger.debug("The Retrieved game: " + retrievedGame);
        int userId = user.getId();
        User retrievedUser = (User) dao.getById(userId);
        assertEquals(retrievedUser, user);
        assertEquals(1, retrievedUser.getGames().size());
        logger.debug("The user game size before remove: " + retrievedUser.getGames().size());
        int sizeBeforeRemove = retrievedUser.getGames().size();
        retrievedUser.removeGame(retrievedGame);
        logger.debug("The user game size after remove: " + retrievedUser.getGames().size());
        assertEquals(sizeBeforeRemove -1, retrievedUser.getGames().size());

    }
}