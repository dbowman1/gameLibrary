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

import static java.lang.Integer.parseInt;

/**
 * The type Delete user.
 */
@WebServlet (name = "DeleteUser", urlPatterns = {"/deleteUser"})
public class DeleteUser extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao dao = new GenericDao(User.class);
        String strId = req.getParameter("id");
        int userId = parseInt(strId);
        User user = (User)dao.getById(userId);
        dao.delete(user);
        logger.info("User deleted: " + user);

        req.setAttribute("msg", user.getUserName() + " deleted...");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewUsers");
        dispatcher.forward(req,resp);
    }
}
