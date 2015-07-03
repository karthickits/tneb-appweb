package com.vz.tnebapp.service.impl;

import com.vz.tnebapp.dao.CustomerDao;
import com.vz.tnebapp.dao.impl.CustomerDaoImpl;
import com.vz.tnebapp.model.Customer;
import com.vz.tnebapp.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	public CustomerServiceImpl(){
		customerDao = new CustomerDaoImpl();
	}
	public int addCustomer(Customer customer){
	
		return customerDao.addCustomer(customer);
	}
}
