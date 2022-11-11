package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "floor")
    private int floor;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private double price;

    @Column(name = "status")
    private String status;

    @ManyToOne
    private Motel549 motel549;

    @OneToMany(mappedBy = "room549", cascade = CascadeType.ALL)
    private List<Contract549> contract549List;

    public Room549() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Motel549 getMotel549() {
        return motel549;
    }

    public void setMotel549(Motel549 motel549) {
        this.motel549 = motel549;
    }

    public List<Contract549> getContract549List() {
        return contract549List;
    }

    public void setContract549List(List<Contract549> contract549List) {
        this.contract549List = contract549List;
    }
}
