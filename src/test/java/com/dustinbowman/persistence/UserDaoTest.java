package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.Role;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
public class UserDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Dao.
     */
    GenericDao dao;
    /**
     * The Users.
     */
    List<User> users;


    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(User.class);
        users = dao.getAll();
    }

    /**
     * Delete user.
     */
    @Test
    public void deleteUser() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    /**
     * Gets user by id.
     */
    @Test
    public void getUserById() {
        User user = users.get(0);
        User returnedUser = (User)dao.getById(1);
        assertEquals(user,returnedUser);


    }

    /**
     * Gets all users success.
     */
    @Test
    public void getAllUsersSuccess() {
        assertTrue(users.size() > 0);
        assertEquals(3, users.size());
        assertFalse(users.get(0).getUserName().equals(""));
    }

    /**
     * Test delete user.
     */
    @Test
    public void testDeleteUser() {
        int sizeBeforeDelete = dao.getAll().size();
        User userDeleted = users.get(0);
        logger.debug("User game size before >" + userDeleted.getGames().size());
        int id = userDeleted.getId();
        userDeleted.removeAll();
        logger.debug("User game size after >" + userDeleted.getGames().size());
        dao.delete(userDeleted);
        int sizeAfterDelete = dao.getAll().size();

        User deletedUser = (User) dao.getById(id);

        assertEquals(sizeBeforeDelete -1 , sizeAfterDelete);
        assertNull(deletedUser);
    }

    /**
     * Test update user.
     */
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


    /**
     * Test insert with role.
     */
    @Test
    public void testInsertWithRole() {
        int insertedUser;
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

    /**
     * Test add game to user.
     */
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
        assertEquals(8, user.getGames().size());
    }

    /**
     * Test multiple user same game.
     */
    @Test
    public void testMultipleUserSameGame() {
        User userOne = users.get(0);
        User userTwo = users.get(1);
        GenericDao gDao = new GenericDao(Game.class);

        Game game = new Game();
        game.setGameId(42);

        userOne.addGame(game);
        userTwo.addGame(game);
        gDao.insert(game);

        dao.saveOrUpdate(userOne);
        dao.saveOrUpdate(userTwo);

        assertEquals(4, userOne.getGames().size());
        assertEquals(2 , userTwo.getGames().size());
    }

    /**
     * Test game already in db to user.
     */
    @Test
    public void testGameAlreadyInDBToUser() {
        User user = users.get(2);
        assertEquals(0 , user.getGames().size());

        GenericDao gDao = new GenericDao(Game.class);
        List<Game> games = gDao.getAll();
        Game game = (Game)gDao.getById(1);
        user.addGame(game);
        dao.saveOrUpdate(user);

        assertTrue(games.contains(game));

        assertEquals(1, user.getGames().size());
    }

    /**
     * Test remove game from user.
     */
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
        assertEquals(3, retrievedUser.getGames().size());
        logger.debug("The user game size before remove: " + retrievedUser.getGames().size());
        int sizeBeforeRemove = retrievedUser.getGames().size();
        logger.debug("The game " + retrievedGame);
        retrievedUser.removeGame(retrievedGame);
        dao.saveOrUpdate(retrievedUser);
        logger.debug("The user game size after remove: " + retrievedUser.getGames().size());
        assertEquals(sizeBeforeRemove -1, retrievedUser.getGames().size());
    }

    /**
     * Test remove all games from user.
     */
    @Test
    public void testRemoveAllGamesFromUser() {
        User user = users.get(0);
        int userId = user.getId();
        User returnedUser = (User)dao.getById(userId);
        assertEquals(user, returnedUser);
        logger.debug("Before: " + returnedUser.getGames().size());
        returnedUser.removeAll();
        dao.saveOrUpdate(returnedUser);
        assertEquals(0, returnedUser.getGames().size());
        logger.debug("After: " + returnedUser.getGames().size());

    }

    /**
     * Test user exist.
     */
    @Test
    public void testUserExist() {
        users = dao.findByPropertyEqual("userName", "username");
        assertTrue(users.size() > 0);
        assertTrue(users.get(0).getEmail().equals("email"));
    }
}
