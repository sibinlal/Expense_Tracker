package com.study.service;

import java.util.List;

import com.study.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public List<Customer> autheticationCheck(Customer theCustomer);
	
}
