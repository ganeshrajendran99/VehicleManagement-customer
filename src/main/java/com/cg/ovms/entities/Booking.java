package com.cg.ovms.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Booking {
	@Id
	@GeneratedValue(
		strategy = GenerationType.AUTO,
		generator ="booking_id"
	)
	@GenericGenerator(
		name = "booking_id",
		strategy = "native"
	)
	private int bookingId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
	private LocalDate bookingDate;
	private LocalDate bookedTillDate;
	private String bookingDescription;
	private double totalCost;
	private double distance;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getBookedTillDate() {
		return bookedTillDate;
	}
	public void setBookedTillDate(LocalDate bookedTillDate) {
		this.bookedTillDate = bookedTillDate;
	}
	public String getBookingDescription() {
		return bookingDescription;
	}
	public void setBookingDescription(String bookingDescription) {
		this.bookingDescription = bookingDescription;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	public Booking(int bookingId, Customer customer, Vehicle vehicle, LocalDate bookingDate, LocalDate bookedTillDate,
			String bookingDescription, double totalCost, double distance) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.vehicle = vehicle;
		this.bookingDate = bookingDate;
		this.bookedTillDate = bookedTillDate;
		this.bookingDescription = bookingDescription;
		this.totalCost = totalCost;
		this.distance = distance;
	}
	
	
	public Booking() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customer=" + customer + ", vehicle=" + vehicle + ", bookingDate="
				+ bookingDate + ", bookedTillDate=" + bookedTillDate + ", bookingDescription=" + bookingDescription
				+ ", totalCost=" + totalCost + ", distance=" + distance + "]";
	}
	
}
