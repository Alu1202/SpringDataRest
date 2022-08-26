package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.modal.Customer;
import com.techment.service.CustomerService;

@RestController
@RequestMapping("cust")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer addNewCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping(value = "customers")
	public List<Customer> getAllCustomer()
	{
		return customerService.getAllCustomer();
	}
	
	
}
