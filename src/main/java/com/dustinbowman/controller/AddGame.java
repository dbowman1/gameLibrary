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

import static java.lang.Integer.parseInt;

/**
 * The type Add game.
 */
@WebServlet (name = "AddGame", urlPatterns = {"/addGame"})
public class AddGame extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);
        GenericDao gDao = new GenericDao(Game.class);
        List<User> users;
        List<Game> games;

        DBCaller db = new DBCaller();
        int id = db.convertIdToInt(req);
        String gameName = db.getGame(req);
        users = db.userFromUserName(req);
        games = db.gameFromGameId(req);


        User returnedUser = users.get(0);
        if(games.size() > 0) {
            //game in DB
            if (!returnedUser.getGames().contains(games.get(0))) {
                // User does not have game in Library
                Game game = games.get(0);
                returnedUser.addGame(game);
                dao.saveOrUpdate(returnedUser);
                req.setAttribute("msg", gameName + " added to your library.");
            } else {
                //User has game already in Library
                req.setAttribute("errorMessage", gameName + " is already in your library.");
            }
        } else {
            //game not in DB
            Game game = new Game();
            game.setGameId(id);
            returnedUser.addGame(game);
            gDao.insert(game);
            dao.saveOrUpdate(returnedUser);
            req.setAttribute("msg", gameName + " added to your library.");
        }

        req.setAttribute("gameID", id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/gameStatusSuccess.jsp");
        dispatcher.forward(req,resp);
    }
}
