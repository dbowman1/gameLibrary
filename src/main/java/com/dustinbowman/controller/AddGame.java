package com.dustinbowman.controller;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.utilities.GamesDB;
import com.dustinbowman.utilities.UsersDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * The type Add game.
 */
@WebServlet (name = "AddGame", urlPatterns = {"/addGame"})
public class AddGame extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String userName = req.getRemoteUser();

        UsersDB usersDB = new UsersDB();
        GamesDB gamesDB = new GamesDB();

        int id = gamesDB.convertIdToInt(req.getParameter("gameId"));
        String gameName = req.getParameter("gameName");

        List<Game> games = gamesDB.getGameFromGameId(req.getParameter("gameId"));

        User user = usersDB.userFromStringProperty(userName);

        String msg = gamesDB.addGameToUser(games,user, gameName, id);
        req.setAttribute("msg", msg);

        req.setAttribute("gameID", id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/gameStatusSuccess.jsp");
        dispatcher.forward(req,resp);
    }
}
