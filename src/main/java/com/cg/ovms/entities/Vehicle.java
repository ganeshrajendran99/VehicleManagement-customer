package com.cg.ovms.entities;

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
public class Vehicle {
	@Id
	@GeneratedValue(
		strategy = GenerationType.AUTO,
		generator ="vehicle_id"
	)
	@GenericGenerator(
		name = "vehicle_id",
		strategy = "native"
	)
	private int vehicleId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driver_id")
	private Driver driver;
	private String vehicleNumber;
	private String type;			//Car or Bus
	private String category; 		//AC or Non-AC
	private String description;
	private String location;
	private String capacity;
	private double chargesPerKM;
	private double fixedCharges;

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public double getChargesPerKM() {
		return chargesPerKM;
	}
	public void setChargesPerKM(double chargesPerKM) {
		this.chargesPerKM = chargesPerKM;
	}
	public double getFixedCharges() {
		return fixedCharges;
	}
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}


	public Vehicle(int vehicleId, Driver driver, String vehicleNumber, String type, String category, String description,
			String location, String capacity, double chargesPerKM, double fixedCharges) {
		super();
		this.vehicleId = vehicleId;
		this.driver = driver;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.category = category;
		this.description = description;
		this.location = location;
		this.capacity = capacity;
		this.chargesPerKM = chargesPerKM;
		this.fixedCharges = fixedCharges;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", driver=" + driver + ", vehicleNumber=" + vehicleNumber + ", type="
				+ type + ", category=" + category + ", description=" + description + ", location=" + location
				+ ", capacity=" + capacity + ", chargesPerKM=" + chargesPerKM + ", fixedCharges=" + fixedCharges + "]";
	}


}
