package com.techment.service;

import java.util.List;

import com.techment.modal.Customer;


public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	List<Customer> getAllCustomer();
	
}
