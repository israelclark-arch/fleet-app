package io.sedettechnologies.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sedettechnologies.fleetapp.models.Location;
import io.sedettechnologies.fleetapp.repositories.LocationRepository;


@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	//Get All Locations
	public List<Location> findAll(){
		return (List<Location>) locationRepository.findAll();
	}	
	
	//Get Location By Id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}	
	
	//Delete Location
	public void delete(int id) {
		locationRepository.deleteById(id);
	}
	
	//Update Location
	public void save( Location location) {
		locationRepository.save(location);
	}
	
	
}
