package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController {
	//Get All Suppliers
	@GetMapping("/suppliers")
	public String getSupplier(){		
		return "supplier";
	}	
	
	


}
