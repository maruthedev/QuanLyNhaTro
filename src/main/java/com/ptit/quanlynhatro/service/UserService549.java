package com.ptit.quanlynhatro.service;

import com.ptit.quanlynhatro.dao.UserDAO549;
import com.ptit.quanlynhatro.model.User549;

public class UserService549 implements CustomService549<User549> {
    private static UserDAO549 userDAO549 = new UserDAO549();

    @Override
    public User549 create(User549 user549) {
        return null;
    }

    @Override
    public User549 update(User549 user549) {
        return null;
    }

    @Override
    public boolean delete(User549 user549) {
        return false;
    }

    public User549 checkLogin(User549 user549){
        return userDAO549.checkLogin(user549);
    }

    public User549 getUserByID(int id){
        return userDAO549.getUserByID(id);
    }
}
