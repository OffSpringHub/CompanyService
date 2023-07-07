package com.offshoringhub.employeeservice.repositories;

import com.offshoringhub.employeeservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}