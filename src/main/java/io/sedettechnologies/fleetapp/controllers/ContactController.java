package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	
	//Get All Contacts
	@GetMapping("/contacts")
	public String getContact(){	
		return "contact";
	}	
	
}
