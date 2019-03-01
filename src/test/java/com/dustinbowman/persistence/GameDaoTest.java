package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GameDaoTest {

    GenericDao dao;
    Game game;

    @Before
    public void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(Game.class);
        game = new Game();
        game.setTitle("Super Awesome");
        game.setDescription("Yup Description");

    }

    @Test
    public void testCreate() {
        // Insert game with title / description and includes the User ID
        int gameId = 0;
        gameId = dao.insert(game);
        Game gameCreated = (Game) dao.getById(gameId);
        assertEquals(gameCreated, game);

    }

    @Test
    public void testGet() {
        int createdId = dao.insert(game);
        Game actualGame = (Game)dao.getById(createdId);
        assertNotNull(actualGame);
        assertEquals(game,actualGame);
    }

    @Test
    public void testGetAll() {
        List<Game> gameList = dao.getAll();
        assertTrue(gameList.size() > 0);
    }

    @Test
    public void testUpdate() {
        int createdId = dao.insert(game);
        game.setId(createdId);
        game.setDescription("Boring");
        game.setTitle("Much Boring very wow");
        dao.saveOrUpdate(game);
        Game updatedGame = (Game) dao.getById(createdId);
        assertEquals(game,updatedGame);

    }

    @Test
    public void testDelete() {
        int createdId = dao.insert(game);
        game.setId(createdId);
        dao.delete(game);
        Game updatedGame = (Game) dao.getById(createdId);
        assertNull(updatedGame);

    }



}
