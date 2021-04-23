package com.cg.ovms.controller;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.service.IBookingService;

import io.swagger.annotations.Api;

@Api(value = "VehicalManagement")
@RestController
@RequestMapping(value="/vehicalManagement/booking")
public class BookingController {
	@Autowired
	IBookingService bookingService;

	@PostMapping(value="/addBooking")
	public ResponseEntity<Object> addBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		bookingService.addBooking(booking);
		return new ResponseEntity<Object>("Vehicle is booked successfully",HttpStatus.OK);
	}
	
	@PostMapping(value="/cancelBooking")
	public ResponseEntity<Object> cancelBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		bookingService.cancelBooking(booking);
		return new ResponseEntity<Object>("Your booking has been cancelled",HttpStatus.OK);

	}
	
	@PutMapping(value="/updateBooking")
	public  ResponseEntity<Object> updateBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		bookingService.updateBooking(booking);
		return new ResponseEntity<Object>("Your booking has been updated",HttpStatus.OK);
	}
	
	@PostMapping(value="/viewBooking")
	public Booking viewBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		return bookingService.viewBooking(booking);
	}
	
	@PostMapping(value="/viewAllBooking")
	public List<Booking> viewAllBooking(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return bookingService.viewAllBooking(customer);
	}
	
	@GetMapping(value="/viewAllBookingByDate")
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return bookingService.viewAllBookingByDate(bookingDate);
	}
	
	@PostMapping(value="/viewAllBookingByVehicle")
	public List<Booking> viewAllBookingByVehicle(@RequestBody Vehicle vehicle) {
		// TODO Auto-generated method stub
		return bookingService.viewAllBookingByVehicle(vehicle);
	}
}
