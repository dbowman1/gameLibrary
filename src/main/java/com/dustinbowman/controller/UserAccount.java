package com.dustinbowman.controller;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;
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
 * The type User account.
 */
@WebServlet (name = "UserAccount", urlPatterns = {"/userAccount"})
public class UserAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao dao = new GenericDao(User.class);

        UsersDB usersDB = new UsersDB();
        List<User> users = usersDB.getListOfUser(req.getRemoteUser());
        int id = 0;

        id = users.get(0).getId();
        User user = (User)dao.getById(id);
        user.setPassword(req.getParameter("newPassword"));
        dao.saveOrUpdate(user);
        req.setAttribute("msg", "Password updated");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/account.jsp");
        dispatcher.forward(req, resp);
    }
}
