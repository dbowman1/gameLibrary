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

@WebServlet (name = "UserAccount", urlPatterns = {"/userAccount"})
public class UserAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao dao = new GenericDao(User.class);
        DBCaller db = new DBCaller();
        String user = db.userFromRemote(req);
        List<User> users;
        users = dao.findByPropertyEqual("userName", user);
        int id = 0;

        if(users.size() == 1) {
            String pass = users.get(0).getPassword();
            if(pass.equals(req.getParameter("originalPass"))) {
                id = users.get(0).getId();
                User returnedUser = (User)dao.getById(id);
                if(req.getParameter("newPassword").equals(req.getParameter("confirmPassword"))){
                    returnedUser.setPassword(req.getParameter("newPassword"));
                    dao.saveOrUpdate(returnedUser);
                    req.setAttribute("msg", "Password updated...");
                } else {
                    req.setAttribute("msg", "New passwords do not match... try again");
                }
            } else {
                req.setAttribute("errorMessage", "Wrong password entry...");
            }
        } else {
            req.setAttribute("errorMessage", "Issues with user");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/account.jsp");
        dispatcher.forward(req, resp);
    }
}
