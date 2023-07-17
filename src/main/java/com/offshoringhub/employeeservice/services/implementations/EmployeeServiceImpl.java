package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Employee;
import com.offshoringhub.employeeservice.exceptions.exceptionModel.NotFoundException;
import com.offshoringhub.employeeservice.models.employee.EmployeeRequest;
import com.offshoringhub.employeeservice.repositories.EmployeeRepository;
import com.offshoringhub.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void addEmployee(EmployeeRequest employeeRequest) {
        Employee employee = Employee.builder()
                .nom(employeeRequest.getNom())
                .prenom(employeeRequest.getPrenom())
                .annéedexpérience(employeeRequest.getAnnéedexpérience())
                .date_naissace(employeeRequest.getDate_naissace())
                .contact(employeeRequest.getContact())
                .build();
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Long idEmp ,EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(idEmp).orElseThrow(()->new NotFoundException("employee not found "));
        employee.setNom(employeeRequest.getNom());
        employee.setPrenom(employeeRequest.getPrenom());
        employee.setContact(employeeRequest.getContact());
        employee.setSociete(employeeRequest.getSociete());
        employee.setAnnéedexpérience(employeeRequest.getAnnéedexpérience());
        employee.setDate_naissace(employeeRequest.getDate_naissace());
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long idemployee) {
        Employee employee = employeeRepository.findById(idemployee).orElseThrow(()->new NotFoundException("employee not found"));
        employeeRepository.delete(employee);
    }


}
