package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.entity.Customer;
import com.study.service.CustomerService;
import com.study.service.LoginServiceHelper;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/authenticate")
	public String authenticateUser(@ModelAttribute("customer") Customer theCustomer) {

		LoginServiceHelper loginHelper = new LoginServiceHelper();
		List<Customer> custList = customerService.autheticationCheck(theCustomer);
		boolean isSuccessLogin = LoginServiceHelper.isSuccessLogin(custList);
		System.out.println("Login success value:" + isSuccessLogin);
		if(isSuccessLogin) {
			return "member-center";
		}
		else {
			return "login";
		}

	}

}
