package com.dustinbowman.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Logout.
 */
@WebServlet(name="Logout", urlPatterns = {"/logout"})
public class Logout  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getSession() != null) {
            req.getSession().invalidate();
        }

        resp.sendRedirect(req.getContextPath()+ "/signInConfirmation.jsp");

    }
}
