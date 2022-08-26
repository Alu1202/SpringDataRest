package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.modal.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
