package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
	
	//Get All VehicleMaintenances
	
	@GetMapping("/vehicleMaintenances")
	public String getVehicleMaitenance(){	
		return "vehicleMaintenance";
	}	

}
