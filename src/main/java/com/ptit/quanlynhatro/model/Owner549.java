package com.ptit.quanlynhatro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owner")
public class Owner549 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int ID;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "tel")
    private String tel;

    @OneToMany(mappedBy = "owner549", cascade = CascadeType.ALL)
    private List<Motel549> motel549List;

    public final static String representativePersonName = "Nguyen Van A";

    public Owner549() {
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Motel549> getMotel549List() {
        return motel549List;
    }

    public void setMotel549List(List<Motel549> motel549List) {
        this.motel549List = motel549List;
    }


}
