package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.models.employee.EmployeeRequest;

public interface EmployeeService {
    void addEmployee(EmployeeRequest employeeRequest);

    void updateEmployee(Long idEmp , EmployeeRequest employeeRequest);

    void deleteEmployee(Long idemployee);
}
