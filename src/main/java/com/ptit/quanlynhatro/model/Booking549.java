package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booking")
public class Booking549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "bookDay")
    private LocalDateTime bookDay;

    @Column(name = "deposit")
    private double deposit;

    @Column(name = "note")
    private String note;

    @ManyToOne
    private Customer549 customer549;

    @ManyToOne
    private User549 user549;

    @OneToMany(mappedBy = "booking549", cascade = CascadeType.ALL)
    private List<Contract549> contract549List;

    public Booking549() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDateTime getBookDay() {
        return bookDay;
    }

    public void setBookDay(LocalDateTime bookDay) {
        this.bookDay = bookDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Customer549 getCustomer549() {
        return customer549;
    }

    public void setCustomer549(Customer549 customer549) {
        this.customer549 = customer549;
    }

    public User549 getUser549() {
        return user549;
    }

    public void setUser549(User549 user549) {
        this.user549 = user549;
    }

    public List<Contract549> getContract549List() {
        if(contract549List == null) contract549List = new ArrayList<>();
        return contract549List;
    }

    public void setContract549List(List<Contract549> contract549List) {
        this.contract549List = contract549List;
    }
}
