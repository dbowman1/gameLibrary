package com.dustinbowman.controller;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;
import com.dustinbowman.utilities.DBCaller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * The type Remove game.
 */
@WebServlet (name = "RemoveGame", urlPatterns = {"/removeGame"})

public class RemoveGame extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);
        DBCaller db = new DBCaller();
        List<User> users;
        List<Game> games;

        String gameName = db.getGame(req);

        users = db.userFromUserName(req);
        games = db.gameFromGameId(req);

        Game game = games.get(0);
        int id = game.getGameId();
        User retrievedUser = users.get(0);

        if (retrievedUser.getGames().contains(game)) {
            retrievedUser.removeGame(game);
            dao.saveOrUpdate(retrievedUser);
            req.setAttribute("msg", gameName + " was successfully removed from your Library.");
        } else {
            req.setAttribute("errorMessage", gameName + " does not exist in your Library");
        }

        req.setAttribute("gameID", id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/gameStatusSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
