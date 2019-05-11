package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import com.dustinbowman.utilities.GamesDB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Games db test.
 */
public class GamesDBTest {
    /**
     * The Games db.
     */
    GamesDB gamesDB;
    /**
     * The G dao.
     */
    GenericDao gDao;
    /**
     * The Dao.
     */
    GenericDao dao;
    /**
     * The Games.
     */
    List<Game> games;
    /**
     * The Users.
     */
    List<User> users;
    /**
     * The User.
     */
    User user;
    /**
     * The Game.
     */
    Game game;

    /**
     * Sets .
     */
    @BeforeEach
    public void setup() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(User.class);
        gamesDB = new GamesDB();
        gDao = new GenericDao(Game.class);
        games = gDao.getAll();
        game = games.get(0);
        users = dao.getAll();
        user = users.get(0);
    }

    /**
     * Test convert int.
     */
    @Test
    public void testConvertInt() {
        String one = "1";
        int oneInt = gamesDB.convertIdToInt(one);
        assertEquals(1, oneInt);
    }

    /**
     * Test user has games in library.
     */
    @Test
    public void testUserHasGamesInLibrary() {
        List<User> users = dao.getAll();
        User user = users.get(0);
        boolean hasGames = gamesDB.userHasGamesInLibrary(user);

        assertEquals(true, hasGames);
    }

    /**
     * Test user game id list.
     */
    @Test
    public void testUserGameIdList() {
        List<Integer> gameIds;
        gameIds = gamesDB.userGameIdList(true, user);
        assertTrue(gameIds.size() > 0);
    }

    /**
     * Test get game from game id.
     */
    @Test
    public void testGetGameFromGameId() {
        List<Game> game = gamesDB.getGameFromGameId("12345");
        assertTrue(game.size() == 1);
    }

    /**
     * Test add game to user.
     */
    @Test
    public void testAddGameToUser() {
        List<Game> gameList = gamesDB.getGameFromGameId("42");
        String msg = gamesDB.addGameToUser(gameList, user, "Test Game", 42);
        assertEquals("Test Game added to your library.", msg);
    }

    /**
     * Test add game in db.
     */
    @Test
    public void testAddGameInDB() {
        List<Game> gameList = gamesDB.getGameFromGameId("24");
        String msg = gamesDB.addGameToUser(gameList, user, "Test Game", 24);
        assertEquals("Test Game is already in your library.", msg);
    }

    /**
     * Test add game in db not in users.
     */
    @Test
    public void testAddGameInDBNotInUsers() {
        List<Game> gameList = gamesDB.getGameFromGameId("67");
        String msg = gamesDB.addGameToUser(gameList, user, "Test Game", 67);
        assertEquals("Test Game added to your library.", msg);
    }

    /**
     * Test game from req.
     */
    @Test
    public void testGameFromReq() {
        Game game = gamesDB.getGameFromReq("12");
        assertEquals(12, game.getGameId());
    }

    /**
     * Test remove game from user not in user db.
     */
    @Test
    public void testRemoveGameFromUserNotInUserDB() {
        String msg = gamesDB.removeGameFromUser(user.getUserName(), "67","Test");
        assertEquals("Test does not exist in your library.", msg);
    }

    /**
     * Test remove game from user.
     */
    @Test
    public void testRemoveGameFromUser() {
        String msg = gamesDB.removeGameFromUser(user.getUserName(), "12","Game 12");
        assertEquals("Game 12 was successfully removed from your library.", msg);
    }

    /**
     * Test remove all games from user.
     */
    @Test
    public void testRemoveAllGamesFromUser() {
        String msg = gamesDB.removeAllGamesFromUser(user);
        assertEquals("All games have been removed...", msg);
        String afterRemovedMsg = gamesDB.removeAllGamesFromUser(user);
        assertEquals("No Games in library...", afterRemovedMsg);
    }

    /**
     * Test game in user library.
     */
    @Test
    public void testGameInUserLibrary() {
        boolean userHasGame = gamesDB.gameInUsersLibrary(user, 12);
        assertTrue(userHasGame);
        boolean userDoesNotHaveGame = gamesDB.gameInUsersLibrary(user, 42);
        assertFalse(userDoesNotHaveGame);
    }
}
