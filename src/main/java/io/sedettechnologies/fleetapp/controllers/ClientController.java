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

import io.sedettechnologies.fleetapp.models.Client;
import io.sedettechnologies.fleetapp.services.ClientService;
import io.sedettechnologies.fleetapp.services.CountryService;
import io.sedettechnologies.fleetapp.services.StateService;

@Controller
public class ClientController {
	
	@Autowired private ClientService clientService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;


	//Get All Clients
	@GetMapping("/clients")
	public String findAll(Model model){		
		model.addAttribute("clients", clientService.findAll());
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("states", stateService.findAll());


		return "client";
	}	

	@RequestMapping("clients/findById") 
	@ResponseBody
	public Optional<Client> findById(Integer id)
	{
		return clientService.findById(id);
	}

	//Add Client
	@PostMapping(value="clients/addNew")
	public String addNew(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}	

	@RequestMapping(value="clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}

	@RequestMapping(value="clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}


}
