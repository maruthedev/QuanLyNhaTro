package com.ptit.quanlynhatro.model;

import com.ptit.quanlynhatro.dao.ServiceDAO549;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tblcontract")
public class Contract549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "partyA", nullable = false)
    private String partyA;

    @Column(name = "partyB", nullable = false)
    private String partyB;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "deposit", nullable = false)
    private double deposit;

    @Column(name = "arrivalDate", nullable = false)
    private LocalDate arrivalDate;

    @ManyToOne
    private Room549 room549;

    @ManyToOne
    private Booking549 booking549;

    @OneToMany(mappedBy = "contract549", cascade = CascadeType.ALL)
    private List<Bill549> bill549List;


    private final static List<Service549> providedServiceList
            = new ArrayList<>(ServiceDAO549.getInstance().getAllServices());
    private final static int limitMonth = 6;

    public Contract549() {
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Room549 getRoom549() {
        return room549;
    }

    public void setRoom549(Room549 room549) {
        this.room549 = room549;
    }

    public Booking549 getBooking549() {
        return booking549;
    }

    public void setBooking549(Booking549 booking549) {
        this.booking549 = booking549;
    }

    public List<Bill549> getBill549List() {
        return bill549List;
    }

    public void setBill549List(List<Bill549> bill549List) {
        this.bill549List = bill549List;
    }

    public static List<Service549> getProvidedServiceList() {
        return providedServiceList;
    }
}
