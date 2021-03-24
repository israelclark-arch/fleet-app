package io.sedettechnologies.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sedettechnologies.fleetapp.models.Employee;
import io.sedettechnologies.fleetapp.models.Employee;
import io.sedettechnologies.fleetapp.repositories.EmployeeRepository;
import io.sedettechnologies.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return (List<Employee>) employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
		
}
