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

import io.sedettechnologies.fleetapp.models.Location;
import io.sedettechnologies.fleetapp.services.CountryService;
import io.sedettechnologies.fleetapp.services.LocationService;
import io.sedettechnologies.fleetapp.services.StateService;

@Controller
@RequestMapping
public class LocationController {
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	@Autowired private LocationService locationService;


	//Get All Locations
	@GetMapping("/locations")
	public String findAll(Model model){		
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("locations", locationService.findAll());

		return "location";
	}	

	@RequestMapping("locations/findById") 
	@ResponseBody
	public Optional<Location> findById(Integer id)
	{
		return locationService.findById(id);
	}

	//Add Location
	@PostMapping(value="locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}	

	@RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}
	
	
	
}