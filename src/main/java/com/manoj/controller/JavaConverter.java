package com.manoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.model.Customer;

@RestController
public class JavaConverter {

	@GetMapping(value="/home"
			,produces = {"application/json","application/xml"}
	)
	public Customer getVal() {
		System.err.println("THis is default ViewResolver");
		Customer cust=new Customer();
		cust.setCustomerId(101);
		cust.setCutomerName("Manoj Kumar Dogra");
		cust.setCustomerPhno(78945613);
		return cust;
	}
}
