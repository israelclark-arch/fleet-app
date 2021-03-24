package io.sedettechnologies.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.sedettechnologies.fleetapp.models.Supplier;
import io.sedettechnologies.fleetapp.services.SupplierService;
import io.sedettechnologies.fleetapp.services.CountryService;
import io.sedettechnologies.fleetapp.services.StateService;

@Controller
public class SupplierController {
	@Autowired private SupplierService supplierService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;


	//Get All Suppliers
	@GetMapping("/suppliers")
	public String findAll(Model model){		
		model.addAttribute("suppliers", supplierService.findAll());
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("states", stateService.findAll());


		return "supplier";
	}	

	@RequestMapping("suppliers/findById") 
	@ResponseBody
	public Optional<Supplier> findById(Integer id)
	{
		return supplierService.findById(id);
	}

	//Add Supplier
	@PostMapping(value="suppliers/addNew")
	public String addNew(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}	

	@RequestMapping(value="suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}

	@RequestMapping(value="suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		supplierService.delete(id);
		return "redirect:/suppliers";
	}


	
	


}
