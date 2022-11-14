package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tblusedService")
public class UsedService549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "totalAmount", nullable = false)
    private double totalAmount;

    @Column(name = "usedTime")
    private LocalDate usedTime;

    @ManyToOne
    private Service549 service549;

    @ManyToOne
    private Bill549 bill549;

    public UsedService549() {
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(LocalDate usedTime) {
        this.usedTime = usedTime;
    }

    public Service549 getService549() {
        return service549;
    }

    public void setService549(Service549 service549) {
        this.service549 = service549;
    }

    public Bill549 getBill549() {
        return bill549;
    }

    public void setBill549(Bill549 bill549) {
        this.bill549 = bill549;
    }
}
