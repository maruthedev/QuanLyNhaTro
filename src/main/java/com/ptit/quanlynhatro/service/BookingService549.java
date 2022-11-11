package com.ptit.quanlynhatro.service;

import com.ptit.quanlynhatro.dao.BookingDAO549;
import com.ptit.quanlynhatro.model.Booking549;

public class BookingService549 implements CustomService549<Booking549> {
    private final static BookingDAO549 bookingDAO549 = new BookingDAO549();
    @Override
    public Booking549 create(Booking549 booking549) {
        return bookingDAO549.create(booking549);
    }

    @Override
    public Booking549 update(Booking549 booking549) {
        return null;
    }

    @Override
    public boolean delete(Booking549 booking549) {
        return false;
    }
}
