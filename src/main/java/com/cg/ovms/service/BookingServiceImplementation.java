package com.cg.ovms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.repository.IBookingRepository;

@Service
public class BookingServiceImplementation implements IBookingService{
	@Autowired
	IBookingRepository bookingRepository;
	
	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking cancelBooking(Booking booking) {
		// TODO Auto-generated method stub
		booking = bookingRepository.findById(booking.getBookingId()).get();
		bookingRepository.delete(booking);
		return booking;
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Booking viewBooking(Booking booking) {
		// TODO Auto-generated method stub
		return booking;
	}

	@Override
	public List<Booking> viewAllBooking(Customer customer) {
		// TODO Auto-generated method stub
		return bookingRepository.findByCustomer(customer);
	}

	@Override
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return bookingRepository.findByBookingDate(bookingDate);
	}

	@Override
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return bookingRepository.findByVehicle(vehicle);
	}

}
