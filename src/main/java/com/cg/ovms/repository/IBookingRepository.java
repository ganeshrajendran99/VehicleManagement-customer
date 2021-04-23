package com.cg.ovms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Vehicle;
@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer> {
	public List<Booking> findByCustomer(Customer customer);
	public List<Booking> findByVehicle(Vehicle vehicle);
	public List<Booking> findByBookingDate(LocalDate bookingDate);
	/*public Booking addBooking(Booking booking);
	public Booking cancelBooking(Booking booking);
	public Booking updateBooking(Booking booking);
	public Booking viewBooking(Booking booking);
	public List<Booking> viewAllBookingByDate
	(LocalDate bookingDate);
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle);
	*/
}
