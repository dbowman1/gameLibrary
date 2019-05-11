package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.test.util.Database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Game dao test.
 */
public class GameDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Dao.
     */
    GenericDao dao;
    /**
     * The Game.
     */
    Game game;
    /**
     * The Games.
     */
    List<Game> games;


    /**
     * Sets up.
     */
    @BeforeEach
    public void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(Game.class);
        games = dao.getAll();

    }

    /**
     * Test create.
     */
    @Test
    public void testCreate() {
        Game game = new Game();
        game.setGameId(245);

        int gameId = dao.insert(game);
        Game gameCreated = (Game) dao.getById(gameId);
        assertEquals(gameCreated, game);
    }

    /**
     * Test get.
     */
    @Test
    public void testGet() {
        Game game = games.get(0);
        Game actualGame = (Game)dao.getById(1);
        assertNotNull(actualGame);
        assertEquals(game,actualGame);
    }

    /**
     * Test get all.
     */
    @Test
    public void testGetAll() {
        List<Game> gameList = dao.getAll();
        logger.debug(gameList);
        assertTrue(gameList.size() > 0);
        assertEquals(4, games.size());
    }

    /**
     * Test update.
     */
    @Test
    public void testUpdate() {
        Game game = games.get(3);
        int id = game.getId();
        game.setGameId(99);
        dao.saveOrUpdate(game);
        Game updatedGame = (Game)dao.getById(id);
        assertEquals(game,updatedGame);

    }

    /**
     * Test delete.
     */
    @Test
    public void testDelete() {
        game = games.get(3);
        dao.delete(dao.getById(4));
        assertNull(dao.getById(4));
    }

}