package com.dustinbowman.controller;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.ClientService;
import com.dustinbowman.utilities.GamesDB;
import com.dustinbowman.utilities.PaginateList;
import com.dustinbowman.utilities.UsersDB;
import com.igdb.api.GameResults;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * The type My library.
 */
@WebServlet(name="MyLibrary", urlPatterns = {"/myLibrary"})
public class MyLibrary extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientService cs = new ClientService();

        String userFromReq = req.getRemoteUser();
        int currentPage = 1;

        if(req.getParameter("page") != null){
            currentPage = Integer.parseInt(req.getParameter("page"));
        }

        UsersDB usersDB = new UsersDB();
        GamesDB gamesDB = new GamesDB();
        User user = usersDB.userFromStringProperty(userFromReq);
        boolean gameInLibrary = gamesDB.userHasGamesInLibrary(user);
        List<Integer> gameIds = gamesDB.userGameIdList(gameInLibrary,user);

        PaginateList<Integer> paginateList = new PaginateList<Integer>(gameIds);
        paginateList.numberOfPages();


        List<Integer> pageGameIds = paginateList.getPage(currentPage);
        String gameIdFormatted = pageGameIds.toString().replace("[", "").replace("]", "");
        String usersLibrary = "where id = (" + gameIdFormatted + ");" +
                "fields name, cover.*;";

        List<GameResults> gameResults;
        gameResults = cs.getApiGame(usersLibrary);



        req.setAttribute("currPage", currentPage);
        req.setAttribute("gameInLibrary", gameInLibrary);
        req.setAttribute("noOfPages", paginateList.numberOfPages());
        req.setAttribute("games", gameResults);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/library.jsp");
        dispatcher.forward(req,resp);
    }
}
