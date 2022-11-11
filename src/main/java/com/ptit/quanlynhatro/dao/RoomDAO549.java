package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.Room549;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO549 extends DAO549<Room549> {
    public RoomDAO549() {
        super();
    }

    @Override
    public Room549 create(Room549 room549) {
        return null;
    }

    @Override
    public Room549 update(Room549 room549) {
        return null;
    }

    @Override
    public Room549 delete(Room549 room549) {
        return null;
    }

    public List<Room549> searchFreeRoom(LocalDate date, double price) {
        try {
            String hql = "From Room549 r WHERE r NOT IN (FROM Contract549 )";
            Query query = getSession().createQuery(hql);

            List<Room549> rooms = new ArrayList<>(query.list());
            return rooms;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Room549 getRoomByID(int id) {
        try {
            String hql = "FROM Room549 WHERE id = :id";
            Query query = getSession().createQuery(hql);
            query.setParameter("id", id);
            return (Room549) query.list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
