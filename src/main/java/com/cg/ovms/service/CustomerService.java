package com.cg.ovms.service;

/*****
 * 
 * @author ganesh
 * Description : This is a Customer Service Class
 * Version : 1.0
 * Date : 24-04-2021
 * 
 *****/

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Customer;
import com.cg.ovms.exception.EntityNotFoundException;
import com.cg.ovms.exception.IdNotFoundException;
import com.cg.ovms.repository.ICustomerRepository;
import com.cg.ovms.repository.IVehicleRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;

	@Autowired
	IVehicleRepository vehicleRepository;

	/**
	 * 
	 * Method: addCustomer
	 * @author ganesh
	 * @param customer
	 * @return ResponseEntity<Object>
	 * Description: This is method to add a Customer
	 * 
	 */

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * 
	 * Method: removeCustomer
	 * @author ganesh
	 * @param customer
	 * @return ResponseEntity<Object>
	 * Description: This is method to remove a Customer
	 * 
	 */

	@Override
	public void removeCustomer(Customer customer) {
		customerRepository.delete(customer);
	}

	/**
	 * 
	 * Method: viewCustomer
	 * @author ganesh
	 * @param customer
	 * @return Customer
	 * Description: This is method to view Customer
	 * 
	 */

	@Override
	public Customer viewCustomer(Customer customer) throws EntityNotFoundException {
		if(customerRepository.existsById(customer.getCustomerId())){

		}
		else
		{
			throw new IdNotFoundException();
		}
		if(customerRepository.findById(customer.getCustomerId()).equals(customer)){
			return customer;
		}
		else {
			throw new EntityNotFoundException();
		}
	}

	/**
	 * 
	 * Method: updateCustomer
	 * @author ganesh
	 * @param customer
	 * @return ResponseEntity<Object>
	 * Description: This is method to update a Customer
	 * 
	 */

	@Override
	public Customer updateCustomer(Customer customer) {
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