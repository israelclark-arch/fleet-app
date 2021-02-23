package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	//Get All Countries
	@GetMapping("/countries")
	public String getCountry(){		
		return "country";
	}	
}
