package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Socials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialsRepository extends JpaRepository<Socials, Long> {
}