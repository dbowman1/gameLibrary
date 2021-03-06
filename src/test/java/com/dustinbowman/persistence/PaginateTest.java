package com.dustinbowman.persistence;

import com.dustinbowman.entity.User;
import com.dustinbowman.utilities.GamesDB;
import com.dustinbowman.utilities.PaginateList;
import com.dustinbowman.utilities.UsersDB;
import com.igdb.api.ReleaseDatesItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Paginate test.
 */
public class PaginateTest {
    /**
     * The Paginate list.
     */
    PaginateList<Integer> paginateList;
    /**
     * The Game ids.
     */
    List<Integer> gameIds;
    /**
     * The Games db.
     */
    GamesDB gamesDB;
    /**
     * The Users db.
     */
    UsersDB usersDB;
    /**
     * The User.
     */
    User user;

    /**
     * Sets up.
     */
    @BeforeEach
    public void setUp() {
        gamesDB = new GamesDB();
        usersDB = new UsersDB();
        user = usersDB.userFromStringProperty("username");
        Boolean gameInLibrary = gamesDB.userHasGamesInLibrary(user);
        gameIds = gamesDB.userGameIdList(gameInLibrary, user);
    }

    /**
     * Test paginate.
     */
    @Test
    public void testPaginate() {
        paginateList = new PaginateList<>(gameIds);
        assertEquals(gameIds, paginateList.getPage(1));
    }

    /**
     * Test paginate null.
     */
    @Test
    public void testPaginateNull() {
        User testUser = usersDB.userFromStringProperty("testuser2");
        Boolean games = gamesDB.userHasGamesInLibrary(testUser);
        List<Integer> gameList = gamesDB.userGameIdList(games, testUser);
        paginateList = new PaginateList<>(gameList);
        assertEquals(gameList, paginateList.getPage(2));
    }

    /**
     * Test number of pages.
     */
    @Test
    public void testNumberOfPages() {
        User testUser = usersDB.userFromStringProperty("testuser2");
        Boolean games = gamesDB.userHasGamesInLibrary(testUser);
        List<Integer> gameList = gamesDB.userGameIdList(games, testUser);
        paginateList = new PaginateList<>(gameList);
        assertEquals(0, paginateList.numberOfPages());
        paginateList = new PaginateList<>(null);
        assertEquals(0, paginateList.numberOfPages());
    }

}
