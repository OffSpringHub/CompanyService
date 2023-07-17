package com.offshoringhub.employeeservice.controllers;


import com.offshoringhub.employeeservice.models.societe.SocieteRequest;
import com.offshoringhub.employeeservice.models.societe.SocieteResponse;
import com.offshoringhub.employeeservice.services.EmployeeService;
import com.offshoringhub.employeeservice.services.SocieteService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/societe")
public class SocieteController {
    @Autowired
    SocieteService societeService;

    @PostMapping
    ResponseEntity<Void> addSociete(@RequestBody SocieteRequest societeRequest){

        societeService.addSociete(societeRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    ResponseEntity<Void> updateSociete(@PathVariable("id") Long idsociete , @RequestBody SocieteRequest societeRequest){
        societeService.updateService(idsociete , societeRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteSociete(@PathVariable("id") Long idsociete ){
        societeService.deleteSociete(idsociete);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    ResponseEntity<SocieteResponse> getSocieteById(@PathVariable("id") Long idsociete)
    {
        return new ResponseEntity<>(societeService.getSocieteByService(idsociete) , HttpStatus.FOUND);
    }


}
