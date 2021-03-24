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

import io.sedettechnologies.fleetapp.models.VehicleHire;
import io.sedettechnologies.fleetapp.services.ClientService;
import io.sedettechnologies.fleetapp.services.LocationService;
import io.sedettechnologies.fleetapp.services.VehicleHireService;
import io.sedettechnologies.fleetapp.services.VehicleService;

@Controller
public class VehicleHireController {
	
	@Autowired private VehicleHireService vehicleHireService;
	@Autowired private VehicleService vehicleService;
	@Autowired private LocationService locationService;
	@Autowired private ClientService clientService;



	//Get All VehicleHires
	@GetMapping("/vehicleHires")
	public String findAll(Model model){		
		model.addAttribute("vehicleHires", vehicleHireService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("clients", clientService.findAll());


		return "vehicleHire";
	}	

	@RequestMapping("vehicleHires/findById") 
	@ResponseBody
	public Optional<VehicleHire> findById(Integer id)
	{
		return vehicleHireService.findById(id);
	}

	//Add VehicleHire
	@PostMapping(value="vehicleHires/addNew")
	public String addNew(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehicleHires";
	}	

	@RequestMapping(value="vehicleHires/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehicleHires";
	}

	@RequestMapping(value="vehicleHires/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleHireService.delete(id);
		return "redirect:/vehicleHires";
	}
	

}
