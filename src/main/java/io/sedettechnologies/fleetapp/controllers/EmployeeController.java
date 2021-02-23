package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	//Get All Employees
	@GetMapping("/employees")
	public String getEmployees() {
		return "employee";
	}	
	
	
}
