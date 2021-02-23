package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {

	//Get All Vehicles
	@GetMapping("/vehicles")
	public String getVehicles(){	
		return "vehicle";
	}	
	
}
