package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "position")
    private String position;

    @OneToMany(mappedBy = "user549", cascade = CascadeType.ALL)
    private List<Booking549> booking549List;

    public User549() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Booking549> getBooking549List() {
        return booking549List;
    }

    public void setBooking549List(List<Booking549> booking549List) {
        this.booking549List = booking549List;
    }
}
