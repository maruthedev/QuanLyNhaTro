package com.ptit.quanlynhatro.controller;

import com.ptit.quanlynhatro.model.User549;
import com.ptit.quanlynhatro.service.UserService549;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet549", value = "/UserServlet549")
public class UserServlet549 extends HttpServlet {
    private ServletContext servletContext;
    private String url;
    private String action;
    private static UserService549 userService549 = new UserService549();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletContext = getServletContext();
        action = request.getParameter("action");
        switch (action) {
            case "login":
                User549 user549 = new User549();
                user549.setUsername(request.getParameter("username"));
                user549.setPassword(request.getParameter("password"));
                User549 loggedUser = checkLogin(user549);

                if (loggedUser == null) {

                    return;
                } else {
                    url = "/ManagerView549.jsp";
                    request.setAttribute("user", loggedUser);
                    request.setAttribute("userID", loggedUser.getID());
                }
                break;
        }
        servletContext.getRequestDispatcher(url).forward(request, response);
    }

    private User549 checkLogin(User549 user549) {
        return userService549.checkLogin(user549);
    }
}
