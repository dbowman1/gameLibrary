package com.dustinbowman.controller;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.ClientService;
import com.dustinbowman.utilities.GamesDB;
import com.dustinbowman.utilities.UsersDB;
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
import java.text.SimpleDateFormat;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * The type Game details.
 */
@WebServlet (name="GameDetails", urlPatterns = {"/game"})

public class GameDetails extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientService cs = new ClientService();

        String id = req.getParameter("id");
        String params = "fields *, release_dates.*, cover.*, artworks.*, screenshots.*, themes.*, videos.*," +
                "websites.*, release_dates.human, cover.url;" +
                "where id = " + id + ";";

        List<GameResults> gameList;
        gameList = cs.getApiGame(params);
        logger.info("The results => " + gameList);

        if(req.getRemoteUser() != null ) {
            int gameId = parseInt(id);
            UsersDB usersDB = new UsersDB();
            GamesDB gamesDB = new GamesDB();
            User user = usersDB.userFromStringProperty(req.getRemoteUser());
            boolean userHasGame = gamesDB.gameInUsersLibrary(user, gameId);
            req.setAttribute("userHasGame", userHasGame);
        }
        int dateTime = gameList.get(0).getReleaseDates().get(0).getDate();
        String date = new SimpleDateFormat("MMM-dd-yyyy").format(new java.util.Date (dateTime*1000L));

        req.setAttribute("games", gameList);
        req.setAttribute("releaseDate", date);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/game.jsp");
        dispatcher.forward(req,resp);
    }
}
