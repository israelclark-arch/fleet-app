package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {
	
	//Get All States
	@GetMapping("/states")
	public String getStates(){	
		return "state";
	}	
	
}
