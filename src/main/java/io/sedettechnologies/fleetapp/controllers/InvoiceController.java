package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
	//Get All Invoices
	@GetMapping("/invoices")
	public String getInvoice(){		
		return "invoice";
	}	
}
