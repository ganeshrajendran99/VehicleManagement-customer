package com.cg.ovms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.Vehicle;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer>{
	public Vehicle getVehicleByVehicleId(int vehicleId);
	public List<Vehicle> getVehiclesByCategory(String category);
	public List<Vehicle> getVehiclesByType(String type);
	public List<Vehicle> getVehiclesByLocation(String location);
}
