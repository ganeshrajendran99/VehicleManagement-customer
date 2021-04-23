package com.cg.ovms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.Vehicle;

@Repository
public interface IPaymentRepository {

	public Booking addPayment(Payment payment);
	public Booking cancelPayment(Payment p);
	public Booking viewPayment(Booking b);
	public List<Booking> viewAllPayments(Vehicle vehicle);
	public double calculateMonthlyRevenue(LocalDate d1,LocalDate d2);
	public double calculateTotalPayment(Vehicle v);
	
}
