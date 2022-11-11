package com.ptit.quanlynhatro.controller;

import com.ptit.quanlynhatro.model.*;
import com.ptit.quanlynhatro.service.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebServlet(name = "BookingServlet549", value = "/BookingServlet549")
public class BookingServlet549 extends HttpServlet {
    private static ServletContext servletContext;
    private static String url;
    private static String action;
    private static BookingService549 bookingService549 = new BookingService549();
    private static RoomService549 roomService549 = new RoomService549();
    private static UserService549 userService549 = new UserService549();
    private static CustomerService549 customerService549 = new CustomerService549();
    private static ContractService549 contractService549 = new ContractService549();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        servletContext = getServletContext();

        String partyA = request.getParameter("contractPartyA");
        String partyB = request.getParameter("contractPartyB");
        Room549 room = roomService549.getRoomByID(Integer.parseInt(request.getParameter("contractRoomID")));
        LocalDateTime bookDay = LocalDateTime.now();
        LocalDate arrivalDate = LocalDate.parse(request.getParameter("contractArrivalDate"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        double price = Double.parseDouble(request.getParameter("contractPrice"));
        double deposit = Double.parseDouble(request.getParameter("contractDeposit"));
        List<Service549> providedServiceList = Contract549.getProvidedServiceList();
        User549 user = userService549.getUserByID(Integer.parseInt(request.getParameter("userID")));
        Customer549 customer = customerService549.getCustomerByIDCard(request.getParameter("customerIDCard"));

        Booking549 booking = new Booking549();
        booking.setBookDay(bookDay);
        booking.setDeposit(deposit);
        booking.setNote("");
        booking.setCustomer549(customer);
        booking.setUser549(user);

        booking = bookingService549.create(booking);

        Contract549 contract = new Contract549();
        contract.setArrivalDate(arrivalDate);
        contract.setDeposit(deposit);
        contract.setPartyA(partyA);
        contract.setPartyB(partyB);
        contract.setPrice(price);
        contract.setBooking549(booking);
        contract.setRoom549(room);

        contract = contractService549.create(contract);

        booking.getContract549List().add(contract);

        if(booking != null && contract != null){
            request.setAttribute("user",user);
            url = "/ManagerView549.jsp";
        }

        servletContext.getRequestDispatcher(url).forward(request, response);
    }
}
