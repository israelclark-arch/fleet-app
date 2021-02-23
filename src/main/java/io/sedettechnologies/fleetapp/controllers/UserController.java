package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	//Get All Users
	@GetMapping("/users")
	public String getUsers(){		
		return "user";
	}	
	

}
