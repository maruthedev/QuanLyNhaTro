package com.ptit.quanlynhatro.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.io.File;

public abstract class DAO549<T> {
    private static Session session;

    protected DAO549() {
        if (session == null) {
            try {
                session = (new Configuration()).configure(new File("C:\\Users\\Administrator\\Desktop\\New folder\\QuanLyNhaTro549\\src\\main\\resources\\Hibernate.config.xml")).buildSessionFactory().openSession();
            } catch (Exception var2) {
                var2.printStackTrace();
            }
        }

    }

    public static Session getSession() {
        return session;
    }

    public abstract T create(T var1);

    public abstract T update(T var1);

    public abstract T delete(T var1);
}