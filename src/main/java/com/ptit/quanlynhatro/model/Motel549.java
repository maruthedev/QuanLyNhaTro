package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tblmotel")
public class Motel549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @ManyToOne
    private Owner549 owner549;

    @OneToMany(mappedBy = "motel549", cascade = CascadeType.ALL)
    private List<Room549> room549List;

    public Motel549() {
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner549 getOwner549() {
        return owner549;
    }

    public void setOwner549(Owner549 owner549) {
        this.owner549 = owner549;
    }

    public List<Room549> getRoom549List() {
        return room549List;
    }

    public void setRoom549List(List<Room549> room549List) {
        this.room549List = room549List;
    }
}
