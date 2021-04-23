package com.cg.ovms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Vehicle;

@Service
public interface IVehicleService {

	public Vehicle addVehicle(Vehicle vehicle);
	public void removeVehicleById(int vehicleId);
	public Vehicle updateVehicle(Vehicle v);
	public Vehicle viewVehicleById(int id);
	public List<Vehicle> viewVehiclesByType(String type);
	public List<Vehicle> viewVehiclesByCategory(String category);
	public List<Vehicle> viewVehiclesByLocation(String location);
	public List<Vehicle> viewAllVehicle();
}
