package com.dustinbowman.controller;

import com.dustinbowman.entity.Role;
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

/**
 * The type User sign up.
 */
@WebServlet(name = "UserSignUp", urlPatterns = {"/userSignUp"})

public class UserSignUp extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("userName"));
        user.setPassword(req.getParameter("password"));
        user.setEmail(req.getParameter("emailAddress"));

        logger.debug("Adding user => " + user);

        Role role = new Role();
        role.setUser(user);
        role.setRole("user");

        GenericDao dao = new GenericDao(User.class);

        List<User> users = dao.findByPropertyEqual("userName", user.getUserName());

        if(users.size() > 0) {
            //Username exists...
            logger.info("Username: " + user.getUserName() + " already exists.");
            req.setAttribute("errorMessage", "The username " + user.getUserName() + " already exists.");
        } else {
            user.addRole(role);
            dao.insert(user);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
