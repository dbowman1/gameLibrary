package com.dustinbowman.utilities;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import javax.servlet.http.HttpServletRequest;

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
        return parseInt(stringId);
    }

    /**
     * Gets game.
     *
     * @param req the req
     * @return the game
     */
    public String getGame(HttpServletRequest req) {
        return req.getParameter("gameName");
    }

    /**
     * User from remote string.
     *
     * @param req the req
     * @return the string
     */
    public String userFromRemote(HttpServletRequest req) {
        return req.getRemoteUser();
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
        return uDao.findByPropertyEqual("userName", name);
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
        return gDao.findByPropertyEqual("gameId", id);
    }

}
