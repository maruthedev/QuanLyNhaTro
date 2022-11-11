package com.ptit.quanlynhatro.service;

import com.ptit.quanlynhatro.dao.CustomerDAO549;
import com.ptit.quanlynhatro.model.Customer549;

public class CustomerService549 implements CustomService549<Customer549> {
    private final static CustomerDAO549 customerDAO549 = new CustomerDAO549();

    @Override
    public Customer549 create(Customer549 customer549) {
        return null;
    }

    @Override
    public Customer549 update(Customer549 customer549) {
        return null;
    }

    @Override
    public boolean delete(Customer549 customer549) {
        return false;
    }

    public Customer549 verifyCustomer(Customer549 customer549) {
        return customerDAO549.verifyCustomer(customer549);
    }

    public Customer549 getCustomerByIDCard(String idcard){
        return customerDAO549.getCustomerByIDCard(idcard);
    }
}
