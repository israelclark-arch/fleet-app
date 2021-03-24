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

import io.sedettechnologies.fleetapp.models.Employee;
import io.sedettechnologies.fleetapp.services.CountryService;
import io.sedettechnologies.fleetapp.services.EmployeeService;
import io.sedettechnologies.fleetapp.services.EmployeeTypeService;
import io.sedettechnologies.fleetapp.services.JobTitleService;
import io.sedettechnologies.fleetapp.services.StateService;

@Controller
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	@Autowired private JobTitleService jobTitleService;
	@Autowired private EmployeeTypeService employeeTypeService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;




	//Get All Employees
	@GetMapping("/employees")
	public String findAll(Model model){
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("jobTitles", jobTitleService.findAll());
		model.addAttribute("employeeTypes", employeeTypeService.findAll());
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("states", stateService.findAll());


		return "employee";
	}	

	@RequestMapping("employees/findById") 
	@ResponseBody
	public Optional<Employee> findById(Integer id)
	{
		return employeeService.findById(id);
	}

	//Add Employee
	@PostMapping(value="employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}	

	@RequestMapping(value="employees/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}

	@RequestMapping(value="employees/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}
	
	
	
	
	
}
