package com.ptit.quanlynhatro.service;

import com.ptit.quanlynhatro.dao.RoomDAO549;
import com.ptit.quanlynhatro.model.Room549;

import java.time.LocalDate;
import java.util.List;

public class RoomService549 implements CustomService549<RoomService549>{
    private static RoomDAO549 roomDAO549 = new RoomDAO549();

    @Override
    public RoomService549 create(RoomService549 roomService549) {
        return null;
    }

    @Override
    public RoomService549 update(RoomService549 roomService549) {
        return null;
    }

    @Override
    public boolean delete(RoomService549 roomService549) {
        return false;
    }

    public List<Room549> searchFreeRoom(LocalDate date, double price){
        return roomDAO549.searchFreeRoom(date, price);
    }

    public Room549 getRoomByID(int ID){
        return roomDAO549.getRoomByID(ID);
    }
}
