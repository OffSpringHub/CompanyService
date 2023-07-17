package com.offshoringhub.employeeservice.controllers;

import com.netflix.discovery.converters.Auto;
import com.offshoringhub.employeeservice.models.employee.EmployeeRequest;
import com.offshoringhub.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    ResponseEntity<Void> addEmployee(EmployeeRequest employeeRequest){
        employeeService.addEmployee(employeeRequest);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    ResponseEntity<Void> updateEmployee(@PathVariable("id") Long idemployee, EmployeeRequest employeeRequest){
        employeeService.updateEmployee(idemployee,employeeRequest);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long idemployee ){
        employeeService.deleteEmployee(idemployee);
        return  new ResponseEntity<>(HttpStatus.OK);
    }



}
