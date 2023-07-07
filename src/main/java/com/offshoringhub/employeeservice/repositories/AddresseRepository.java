package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddresseRepository extends JpaRepository<Addresse, Long> {
}