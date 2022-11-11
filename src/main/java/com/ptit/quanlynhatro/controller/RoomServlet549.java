package com.ptit.quanlynhatro.controller;

import com.ptit.quanlynhatro.model.Room549;
import com.ptit.quanlynhatro.service.RoomService549;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RoomServlet549", value = "/RoomServlet549")
public class RoomServlet549 extends HttpServlet {
    private static ServletContext servletContext;
    private static String action;
    private static String url;
    private static RoomService549 roomService549 = new RoomService549();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletContext = getServletContext();
        action = request.getParameter("action");

        switch (action) {
            case "searchFreeRoom":
                String userID = request.getParameter("userID");
                LocalDate date = LocalDate.parse(request.getParameter("roomDateCondition"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                double price = Double.parseDouble(request.getParameter("roomPriceCondition"));
                List<Room549> rooms = new ArrayList<>(searchFreeRoom(date, price));
                if (rooms == null) {

                    return;
                } else {
                    request.setAttribute("rooms", rooms);
                    request.setAttribute("arrivalDate", date.toString());
                    request.getSession().setAttribute("arrivalDate", date.toString());
                    request.setAttribute("userID",userID);
                    this.getServletConfig().getServletContext().setAttribute("arrivalDate", date.toString());
                    url = "/SearchFreeRoom549.jsp";
                }
                break;

            case "clickRoom":
                Room549 room549 = new Room549();
                room549.setID(Integer.parseInt(request.getParameter("clickedRoomID")));
                room549.setName(request.getParameter("clickedRoomName"));
                room549.setFloor(Integer.parseInt(request.getParameter("clickedRoomFloor")));
                room549.setType(request.getParameter("clickedRoomType"));
                room549.setPrice(Double.parseDouble(request.getParameter("clickedRoomPrice")));
                room549.setStatus(request.getParameter("clickedRoomStatus"));

                request.setAttribute("arrivalDate", LocalDate.parse(request.getParameter("arrivalDate"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                request.setAttribute("clickedRoom", request.getParameter("clickedRoomID"));
                request.getSession().setAttribute("clickedRoom", request.getParameter("clickedRoomID"));

                request.setAttribute("userID",request.getParameter("userID"));
                url = "/CustomerInfoView549.jsp";
                break;
        }
        servletContext.getRequestDispatcher(url).forward(request, response);
    }

    private List<Room549> searchFreeRoom(LocalDate date, double price) {
        return roomService549.searchFreeRoom(date, price);
    }
}
