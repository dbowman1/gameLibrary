package com.dustinbowman.controller;

import com.dustinbowman.persistence.ClientService;
import com.igdb.api.GameResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * The type Search game.
 */
@WebServlet (name="SearchGame", urlPatterns = {"/search"})

public class SearchGame extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientService cs = new ClientService();
        String userGameSearch = req.getParameter("search");
        String gameSearch = "search \"" + userGameSearch + "\";" +
                "fields name, cover.url;";


        List<GameResults> gameResults;
        gameResults = cs.getApiGame(gameSearch);
        req.setAttribute("games", gameResults);
        req.setAttribute("searchedGame", userGameSearch);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/gameSearch.jsp");
        dispatcher.forward(req,resp);

    }


}
