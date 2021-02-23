package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
	
	//Get All VehicleTypes
	@GetMapping("/vehicleTypes")
	public String getVehicleType(){	
		return "vehicleType";
	}	


}
