package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {
	//Get All VehicleMovements
	@GetMapping("/vehicleMovements")
	public String getVehicleMovement(){	
		return "vehicleMovement";
	}	
	


}
