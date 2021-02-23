package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {
	
	//Get All VehicleStatuss
	@GetMapping("/vehicleStatuses")
	public String getVehicleStatus(){
		return "vehicleStatus";
	}	


}
