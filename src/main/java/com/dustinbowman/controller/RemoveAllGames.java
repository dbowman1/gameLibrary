package com.dustinbowman.controller;

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

/**
 * The type Remove all games.
 */
@WebServlet( name="RemoveAllGames", urlPatterns = {"/removeAllGames"})
public class RemoveAllGames extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao dao = new GenericDao(User.class);
        DBCaller db = new DBCaller();
        List<User> users = db.userFromUserName(req);

        User user = users.get(0);
        if(user.getGames().size() > 0) {
            user.removeAll();
            dao.saveOrUpdate(user);
            req.setAttribute("msg", "All Games have been removed...");
        } else {
            req.setAttribute("msg", "No Games in library...");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/account.jsp");
        dispatcher.forward(req,resp);
    }
}
