package com.cg.ovms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Customer;
import com.cg.ovms.repository.ICustomerRepository;
import com.cg.ovms.repository.IVehicleRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;

	@Autowired
	IVehicleRepository vehicleRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
	    customerRepository.delete(customer);
	}

	@Override
	public Customer viewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
//	@Override
//	public Customer viewAllCustomer(String vtype) {
//		// TODO Auto-generated method stub
//		return vehicleRepository.getVehiclesByType(vtype);
//	}
//
//	@Override
//	public List<Customer> viewAllCustomersByLocation(String location) {
//		// TODO Auto-generated method stub
//		return vehicleRepository.findByLocation(location);
//	} 
}