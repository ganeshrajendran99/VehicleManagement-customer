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

import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.service.IVehicleService;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {
	
	@Autowired
	IVehicleService vehicleService;
	
	@PostMapping(value = "/addVehicle")
	public ResponseEntity<Object> addVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.addVehicle(vehicle);
		return new ResponseEntity<Object>("Vehicle Added.", HttpStatus.OK);
	}
	
	@PutMapping(value="/updateVehicle")
	public ResponseEntity<String> updateVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.updateVehicle(vehicle);
		return new ResponseEntity<String>("Successfully Updated", HttpStatus.OK);
	}
	
	@GetMapping(value="/viewAllVehicles")
	public List<Vehicle> viewAllVehicles() {
		return vehicleService.viewAllVehicle();
	}
	
	@GetMapping(value="/viewVehiclesById/{vehicleId}")
	public Vehicle getVehicleByName(@PathVariable int vehicleId) {
		return vehicleService.viewVehicleById(vehicleId);
	}
	
	@GetMapping(value="/viewVehiclesByType/{type}")
	public List<Vehicle> getVehicleByType(@PathVariable String type) {
		return vehicleService.viewVehiclesByType(type);
	}

	@GetMapping(value="/viewVehicleByCategory/{category}")
	public List<Vehicle> getVehicleByCategory(@PathVariable String category) {
		return vehicleService.viewVehiclesByCategory(category);
	}
	
	@GetMapping(value="/viewVehicleByLocation/{location}")
	public List<Vehicle> getVehicleByLocation(@PathVariable String location) {
		return vehicleService.viewVehiclesByLocation(location);
	}
	
	@DeleteMapping(value="/removeVehicleById/{vehicleId}")
	public ResponseEntity<String> removeVehicleById(@PathVariable int vehicleId) {
		vehicleService.removeVehicleById(vehicleId);
		return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
	}
}
