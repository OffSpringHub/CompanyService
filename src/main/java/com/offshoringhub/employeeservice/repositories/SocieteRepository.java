package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Societe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocieteRepository extends JpaRepository<Societe, Long> {
}