package com.dustinbowman.controller;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.ClientService;
import com.dustinbowman.persistence.GenericDao;
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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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


        if(req.getRemoteUser() != null ) {
            GenericDao dao = new GenericDao(User.class);
            List<User> users = dao.findByPropertyEqual("userName", req.getRemoteUser());
            int gameId = parseInt(id);
            boolean userHasGame = false;
            for (Game game : users.get(0).getGames()) {
                if (game.getGameId() == gameId) {
                    userHasGame = true;
                    break;
                }
            }
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
