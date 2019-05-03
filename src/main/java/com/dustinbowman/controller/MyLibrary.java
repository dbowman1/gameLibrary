package com.dustinbowman.controller;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.ClientService;
import com.dustinbowman.persistence.GenericDao;
import com.dustinbowman.utilities.PaginateList;
import com.igdb.api.GameResults;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type My library.
 */
@WebServlet(name="MyLibrary", urlPatterns = {"/myLibrary"})
public class MyLibrary extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientService cs = new ClientService();

        GenericDao userDao = new GenericDao(User.class);
        String user = req.getRemoteUser();
        int currentPage = 1;

        if(req.getParameter("page") != null){
            currentPage = Integer.parseInt(req.getParameter("page"));
        }

        List<User> returnedUsers = userDao.findByPropertyEqual("userName", user);
        User returnedUser = returnedUsers.get(0);
        List<Integer> gameIds = new ArrayList<>();
        boolean gameInLibrary = false;
        if(returnedUser.getGames().size() > 0) {
            gameInLibrary = true;
            for(Game game : returnedUser.getGames()) {
                gameIds.add(game.getGameId());
            }
        }
        PaginateList<Integer> paginateList = new PaginateList<Integer>(gameIds, 10);
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
