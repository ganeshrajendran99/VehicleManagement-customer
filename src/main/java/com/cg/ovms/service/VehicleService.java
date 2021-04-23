package com.cg.ovms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.repository.IVehicleRepository;

@Service
public class VehicleService implements IVehicleService{

	@Autowired
	IVehicleRepository vehicleRepo;
	
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Vehicle viewVehicleById(int vehicleId) {
		return vehicleRepo.getVehicleByVehicleId(vehicleId);
	}

	@Override
	public List<Vehicle> viewVehiclesByType(String type) {
		return vehicleRepo.getVehiclesByType(type);
	}
	
	@Override
	public List<Vehicle> viewVehiclesByCategory(String category) {
		return vehicleRepo.getVehiclesByCategory(category);
	}

	@Override
	public List<Vehicle> viewVehiclesByLocation(String location) {
		return vehicleRepo.getVehiclesByLocation(location);
	}
	
	@Override
	public List<Vehicle> viewAllVehicle() {
		return vehicleRepo.findAll();
	}

	@Override
	public void removeVehicleById(int vehicleId) {
		vehicleRepo.deleteById(vehicleId);
	}
	
}
