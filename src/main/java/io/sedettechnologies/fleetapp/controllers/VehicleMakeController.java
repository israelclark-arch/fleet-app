package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
	
	//Get All VehicleMakes
	@GetMapping("/vehicleMakes")
	public String getVehicleMake() {
		return "vehicleMake";
	}
}
