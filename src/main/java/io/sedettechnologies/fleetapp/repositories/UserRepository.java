package io.sedettechnologies.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.sedettechnologies.fleetapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
