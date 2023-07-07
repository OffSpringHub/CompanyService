package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Addresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

public interface AddresseRepository extends JpaRepository<Addresse, Long> {

}