package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {
}