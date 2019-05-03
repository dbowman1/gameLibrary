package com.dustinbowman.utilities;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * The type Db caller.
 */
public class DBCaller {

    /**
     * Convert id to int int.
     *
     * @param req the req
     * @return the int
     */
    public int convertIdToInt(HttpServletRequest req) {
        String stringId = req.getParameter("gameId");
        int id = parseInt(stringId);
        return id;
    }

    /**
     * Gets game.
     *
     * @param req the req
     * @return the game
     */
    public String getGame(HttpServletRequest req) {
        String gameName = req.getParameter("gameName");
        return gameName;
    }

    /**
     * User from remote string.
     *
     * @param req the req
     * @return the string
     */
    public String userFromRemote(HttpServletRequest req) {
        String name = req.getRemoteUser();
        return name;
    }
    /**
     * User from user name list.
     *
     * @param req the req
     * @return the list
     */
    public List userFromUserName(HttpServletRequest req) {
        String name = req.getRemoteUser();
        GenericDao uDao = new GenericDao(User.class);
        List<User> users = uDao.findByPropertyEqual("userName", name);
        return users;
    }
    /**
     * Game from game id list.
     *
     * @param req the req
     * @return the list
     */
    public List gameFromGameId(HttpServletRequest req) {
        GenericDao gDao = new GenericDao(Game.class);
        String stringId = req.getParameter("gameId");
        int id = parseInt(stringId);
        List<Game> games = gDao.findByPropertyEqual("gameId", id);
        return  games;
    }

}
