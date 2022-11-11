package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "bill")
public class Bill549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "paymentDate")
    private LocalDate paymentDate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "payerName")
    private String payerName;

    @ManyToOne
    private Contract549 contract549;

    @OneToMany(mappedBy = "bill549", cascade = CascadeType.ALL)
    private List<UsedService549> usedService549List;

    public Bill549() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Contract549 getContract549() {
        return contract549;
    }

    public void setContract549(Contract549 contract549) {
        this.contract549 = contract549;
    }

    public List<UsedService549> getUsedService549List() {
        return usedService549List;
    }

    public void setUsedService549List(List<UsedService549> usedService549List) {
        this.usedService549List = usedService549List;
    }
}
