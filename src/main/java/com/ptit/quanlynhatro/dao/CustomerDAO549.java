package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.Customer549;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CustomerDAO549 extends DAO549<Customer549> {
    public CustomerDAO549() {
        super();
    }

    @Override
    public Customer549 create(Customer549 customer549) {
        try {
            Transaction transaction = getSession().getTransaction();
            if (!transaction.isActive()) transaction.begin();
            getSession().save(customer549);
            return customer549;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Customer549 update(Customer549 customer549) {
        return null;
    }

    @Override
    public Customer549 delete(Customer549 customer549) {
        return null;
    }

    public Customer549 verifyCustomer(Customer549 customer549) {
        try {
            String searchSQL = "FROM Customer549 WHERE IDCard = :idcard";
            Query query = getSession().createQuery(searchSQL);
            query.setParameter("idcard", customer549.getIDCard());
            int size = query.list().size();
            if (size == 0) {
                return create(customer549);
            } else {
                return (Customer549) query.list().get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Customer549 getCustomerByIDCard(String idcard) {
        try {
            String hql = "FROM Customer549 WHERE IDCard = :idc";
            Query query = getSession().createQuery(hql);
            query.setParameter("idc", idcard);
            return (Customer549) query.list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
