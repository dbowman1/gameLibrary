package com.dustinbowman.utilities;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class DBCaller {

    public int convertIdToInt(HttpServletRequest req) {
        String stringId = req.getParameter("gameId");
        int id = parseInt(stringId);
        return id;
    }
    public String getGame(HttpServletRequest req) {
        String gameName = req.getParameter("gameName");
        return gameName;
    }

    public String userFromRemote(HttpServletRequest req) {
        String name = req.getRemoteUser();
        return name;
    }
    public User userFromId(int id) {
        GenericDao uDao = new GenericDao(User.class);
        User user = (User)uDao.getById(id);
        return user;
    }

    public List gamesFromId(int id) {
        GenericDao gDao = new GenericDao(Game.class);
        List<Game> games = gDao.findByPropertyEqual("gameId", id);
        return games;
    }

    public List userFromUserName(HttpServletRequest req) {
        String name = req.getRemoteUser();
        GenericDao uDao = new GenericDao(User.class);
        List<User> users = uDao.findByPropertyEqual("userName", name);
        return users;
    }

    public List gameFromGameId(HttpServletRequest req) {
        GenericDao gDao = new GenericDao(Game.class);
        String stringId = req.getParameter("gameId");
        int id = parseInt(stringId);
        List<Game> games = gDao.findByPropertyEqual("gameId", id);
        return  games;
    }

}
