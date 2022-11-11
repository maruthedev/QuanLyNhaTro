package com.ptit.quanlynhatro.service;

import com.ptit.quanlynhatro.dao.ContractDAO549;
import com.ptit.quanlynhatro.model.Contract549;

public class ContractService549 implements CustomService549<Contract549> {
    private final static ContractDAO549 contractDAO549 = new ContractDAO549();

    @Override
    public Contract549 create(Contract549 contract549) {
        return contractDAO549.create(contract549);
    }

    @Override
    public Contract549 update(Contract549 contract549) {
        return null;
    }

    @Override
    public boolean delete(Contract549 contract549) {
        return false;
    }
}
