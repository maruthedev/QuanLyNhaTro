package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.Booking549;
import org.hibernate.Transaction;

public class BookingDAO549 extends DAO549<Booking549> {
    public BookingDAO549() {
        super();
    }

    @Override
    public Booking549 create(Booking549 booking549) {
        try {
            Transaction transaction = getSession().getTransaction();
            if (!transaction.isActive()) transaction.begin();
            getSession().save(booking549);
            transaction.commit();
            return booking549;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Booking549 update(Booking549 booking549) {
        return null;
    }

    @Override
    public Booking549 delete(Booking549 booking549) {
        return null;
    }
}
