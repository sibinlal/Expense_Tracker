package com.study.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.entity.Customer;

public class LoginServiceHelper {
	
	CustomerService customerService;
	
	public boolean isSuccessLogin(Customer theCustomer) {
		boolean isLoginSuccess = false;
		customerService = new CustomerServiceImpl();
		System.out.println("inside login service helper method");
		List<Customer> custList = customerService.autheticationCheck(theCustomer);
		System.out.println("came back to login helper");
		for(Customer i : custList) {
			System.out.println(i);
		}
		if(null != custList && custList.size() <= 2) {
			isLoginSuccess = true;
		}		
		return isLoginSuccess;		
	}

}
