package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.Service549;
import org.hibernate.query.Query;

import java.util.List;

public class ServiceDAO549 extends DAO549<Service549> {
    private static ServiceDAO549 instance;

    private ServiceDAO549() {
        super();
    }

    public static ServiceDAO549 getInstance() {
        if (instance == null) {
            instance = new ServiceDAO549();
        }
        return instance;
    }

    public List<Service549> getAllServices() {
        try {
            String hql = "FROM Service549";
            Query query = getSession().createQuery(hql);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Service549 create(Service549 service549) {
        return null;
    }

    @Override
    public Service549 update(Service549 service549) {
        return null;
    }

    @Override
    public Service549 delete(Service549 service549) {
        return null;
    }
}
