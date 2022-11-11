package com.ptit.quanlynhatro.controller;

import com.ptit.quanlynhatro.model.Contract549;
import com.ptit.quanlynhatro.model.Customer549;
import com.ptit.quanlynhatro.model.Owner549;
import com.ptit.quanlynhatro.service.CustomerService549;
import com.ptit.quanlynhatro.service.RoomService549;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "CustomerServlet549", value = "/CustomerServlet549")
public class CustomerServlet549 extends HttpServlet {
    private static ServletContext servletContext;
    private static String url;
    private static String action;
    private static RoomService549 roomService549 = new RoomService549();
    private static CustomerService549 customerService549 = new CustomerService549();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletContext = getServletContext();
        action = request.getParameter("action");
        switch (action) {
            case "inputCustomer":
                Customer549 inpCus = new Customer549();
                inpCus.setFullName(request.getParameter("customerName"));
                inpCus.setDob(LocalDate.parse(request.getParameter("customerDob"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                inpCus.setIDCard(request.getParameter("customerIDCard"));
                inpCus.setTel(request.getParameter("customerTel"));
                inpCus.setHometown(request.getParameter("customerHometown"));

                Customer549 customer = customerService549.verifyCustomer(inpCus);
                System.out.println(customer.getID());

                request.setAttribute("customer", customer);
                request.setAttribute("clickedRoom",roomService549.getRoomByID(Integer.parseInt(request.getParameter("clickedRoom"))));
                request.setAttribute("providedServiceList", Contract549.getProvidedServiceList());
                request.setAttribute("partyA", Owner549.representativePersonName);
                request.setAttribute("contractArrivalDate", LocalDate.parse(request.getParameter("arrivalDate"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));

                request.setAttribute("userID",request.getParameter("userID"));
                url = "/ContractView549.jsp";
                break;
        }
        servletContext.getRequestDispatcher(url).forward(request, response);
    }
}
