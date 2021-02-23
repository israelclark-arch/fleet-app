package io.sedettechnologies.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.sedettechnologies.fleetapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
