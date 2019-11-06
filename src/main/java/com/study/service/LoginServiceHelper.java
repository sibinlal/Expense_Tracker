package com.study.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.entity.Customer;

public class LoginServiceHelper {
	
	public static boolean isSuccessLogin(List<Customer> custList) {
		boolean isLoginSuccess = true;
		System.out.println(custList.size());
		for(Customer i : custList) {
			System.out.println(i);
		}
		if(custList.isEmpty() || custList.size() >= 2) {
			isLoginSuccess = false;
		}
			
		System.out.println(custList.isEmpty());		
		return isLoginSuccess;		
	}

}
