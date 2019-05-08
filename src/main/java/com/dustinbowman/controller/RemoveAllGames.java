package com.dustinbowman.controller;

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

/**
 * The type Remove all games.
 */
@WebServlet( name="RemoveAllGames", urlPatterns = {"/removeAllGames"})
public class RemoveAllGames extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        GamesDB gamesDB = new GamesDB();
        UsersDB usersDB = new UsersDB();
        User user = usersDB.userFromStringProperty(req.getRemoteUser());
        String msg = gamesDB.removeAllGamesFromUser(user);

        req.setAttribute("msg", msg);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/account.jsp");
        dispatcher.forward(req,resp);
    }
}
