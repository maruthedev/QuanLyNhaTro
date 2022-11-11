package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service")
public class Service549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "pricePerUnit")
    private double pricePerUnit;

    @Column(name = "note")
    private String note;

    @OneToMany(mappedBy = "service549", cascade = CascadeType.ALL)
    private List<UsedService549> usedService549List;

    public Service549() {
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

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<UsedService549> getUsedService549List() {
        return usedService549List;
    }

    public void setUsedService549List(List<UsedService549> usedService549List) {
        this.usedService549List = usedService549List;
    }
}
