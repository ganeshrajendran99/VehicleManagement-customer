package com.cg.ovms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Customer;
import com.cg.ovms.exception.EntityNotFoundException;

@Service
public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public void removeCustomer(Customer customer);
	public Customer viewCustomer(Customer customer) throws EntityNotFoundException;
	public Customer updateCustomer(Customer c);
//	public Customer viewAllCustomer(String vtype);
//    public Customer viewAllCustomersByLocation(String location);
	
}