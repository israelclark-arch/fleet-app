package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
		
	//Get All EmployeeTypes
	@GetMapping("/employeeTypes")
	public String getEmployeeType(){
		return "employeeType";
	}	
	
	

}
