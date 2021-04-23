package com.cg.ovms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Customer;

@Service
public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public void removeCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public Customer updateCustomer(Customer c);
//	public Customer viewAllCustomer(String vtype);
//    public Customer viewAllCustomersByLocation(String location);
	
}