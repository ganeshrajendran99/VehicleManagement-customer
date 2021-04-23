package com.cg.ovms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovms.entities.Customer;
import com.cg.ovms.service.ICustomerService;

import io.swagger.annotations.Api;

@Api(value="VehicleMangement")
@RestController
@RequestMapping(value="/customer")

public class CustomerController {
	
	@Autowired
	ICustomerService customerService;

	@PostMapping(value="/addCustomer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return new ResponseEntity<Object>("Customer Added", HttpStatus.OK);
	}
	
	@DeleteMapping(value="/removeCustomer")
	public ResponseEntity<Object> removeCustomer(@RequestBody Customer customer){
		customerService.removeCustomer(customer);
		return new ResponseEntity<Object>("Customer Removed", HttpStatus.OK);
	}
	
	@PostMapping(value="/viewCustomer")
	public Customer viewCustomer(@RequestBody Customer customer){
		return customerService.viewCustomer(customer);
	}
	
	@PutMapping(value="/updateCustomer")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return new ResponseEntity<Object>("Customer has been Updated", HttpStatus.OK);
	}
	
//	@GetMapping(value="/viewAllCustomer/{vtype}")
//	public List<Customer> viewAllCustomer(@PathVariable String vtype){
//		return customerService.viewAllCustomer(vtype);
//	}
//	
//	@GetMapping(value="/viewAllCustomerByLocation/{vtype}")
//	public List<Customer> viewAllCustomerByLocation(@PathVariable String vtype){
//		return customerService.viewAllCustomersByLocation(vtype);
//	}
}