package com.ptit.quanlynhatro.dao;

import com.ptit.quanlynhatro.model.Contract549;
import org.hibernate.Transaction;

public class ContractDAO549 extends DAO549<Contract549> {
    public ContractDAO549() {
        super();
    }

    @Override
    public Contract549 create(Contract549 contract549) {
        try {
            Transaction transaction = getSession().getTransaction();
            if (!transaction.isActive()) transaction.begin();
            getSession().save(contract549);
            return contract549;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Contract549 update(Contract549 contract549) {
        return null;
    }

    @Override
    public Contract549 delete(Contract549 contract549) {
        return null;
    }
}
