package com.dustinbowman.controller;

import com.dustinbowman.utilities.GamesDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * The type Remove game.
 */
@WebServlet (name = "RemoveGame", urlPatterns = {"/removeGame"})

public class RemoveGame extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GamesDB gamesDB = new GamesDB();

        String userName = req.getRemoteUser();
        String gameName = req.getParameter("gameName");
        String gameId = req.getParameter("gameId");
        String msg = gamesDB.removeGameFromUser(userName, gameId, gameName);

        req.setAttribute("msg", msg);
        req.setAttribute("gameID", gamesDB.convertIdToInt(gameId));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/gameStatusSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
