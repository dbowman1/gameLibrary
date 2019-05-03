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
 * The type New releases.
 */
@WebServlet (name="NewReleases", urlPatterns = {"/newReleases"})

public class NewReleases extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientService cs = new ClientService();
        Long currentTime = System.currentTimeMillis() / 1000L;
        String params = "fields name, summary, release_dates, cover.url, release_dates.human;where popularity > 80 & "
                + "release_dates.date > " + currentTime + " & release_dates.platform = (6); limit 10; sort name asc;";
        List<GameResults> gameList;
        gameList = cs.getApiGame(params);
        req.setAttribute("games", gameList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);

    }
}
