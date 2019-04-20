package com.dustinbowman.controller;

import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;
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

@WebServlet(name = "ViewUsers", urlPatterns = {"/admin/viewUsers"})

public class ViewUsers extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<User> dao = new GenericDao(User.class);
        List<User> users = dao.getAll();
        req.setAttribute("users", users);
        logger.debug("Sending users =>" + users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/viewUsers.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
