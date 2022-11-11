package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.User549;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class UserDAO549 extends DAO549<User549> {
    public UserDAO549() {
        super();
    }

    @Override
    public User549 create(User549 user549) {
        return null;
    }

    @Override
    public User549 update(User549 user549) {
        return null;
    }

    @Override
    public User549 delete(User549 user549) {
        return null;
    }


    public User549 checkLogin(User549 user549) {
        try {
            String hql = "FROM User549 WHERE username = :un AND password = :pw";
            Query query = getSession().createQuery(hql);
            query.setParameter("un", user549.getUsername());
            query.setParameter("pw", user549.getPassword());
            List<User549> users = new ArrayList<>(query.list());
            return users.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public User549 getUserByID(int id){
        try {
            String hql = "FROM User549 WHERE id = :id";
            Query query = getSession().createQuery(hql);
            query.setParameter("id",id);
            return (User549) query.list().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // gen db table
    public static void main(String[] args) {
        UserDAO549 userDAO549 = new UserDAO549();
        System.out.println(userDAO549);
    }
}
