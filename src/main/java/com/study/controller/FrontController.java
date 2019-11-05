package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.entity.Customer;
import com.study.service.CustomerService;

@Controller
@RequestMapping("/ET")
public class FrontController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/showHome")
	public String showHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/showSignUpPage")
	public String showSignUpPage() {
		return "customer-registration";
	}
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerCustomer(@ModelAttribute("customer") Customer theCustomer, Model theModel) {
		customerService.saveCustomer(theCustomer);
		String message = "Registration is successfull";
		theModel.addAttribute("message",message);
		return "login";
		
	}

}
