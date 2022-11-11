package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "idCard")
    private String IDCard;

    @Column(name = "tel")
    private String tel;

    @Column(name = "hometown")
    private String hometown;

    @OneToMany(mappedBy = "customer549", cascade = CascadeType.ALL)
    private List<Booking549> booking549List;

    public Customer549() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public List<Booking549> getBooking549List() {
        return booking549List;
    }

    public void setBooking549List(List<Booking549> booking549List) {
        this.booking549List = booking549List;
    }
}
