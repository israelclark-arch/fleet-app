package io.sedettechnologies.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

	
	//Get All InvoiceStatuss
	@GetMapping("/invoiceStatuses")
	public String getInvoiceStatus(){	
		return "invoiceStatus";
	}	
}
