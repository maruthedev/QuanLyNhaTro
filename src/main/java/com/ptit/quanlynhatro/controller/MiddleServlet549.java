package com.ptit.quanlynhatro.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MiddleServlet549", value = "/MiddleServlet549")
public class MiddleServlet549 extends HttpServlet {
    private static ServletContext servletContext;
    private static String url;
    private static String action;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletContext = getServletContext();
        action = request.getParameter("action");

        switch (action){
            case "searchFreeRoom":

                request.setAttribute("userID", request.getParameter("userID"));
                url = "/SearchFreeRoom549.jsp";
                break;
            default:
                url = "/ManagerView549.jsp";
                break;
        }
        servletContext.getRequestDispatcher(url).forward(request,response);
    }
}
