package com.offshoringhub.employeeservice.controllers;

import brave.Request;
import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;
import com.offshoringhub.employeeservice.services.AddresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/addresse")
public class AddresseController {

    @Autowired
    AddresseService addresseService;

    @GetMapping("/{id}")
    ResponseEntity<AddresseResponse> getAddresseById(@PathVariable("id") Long idAddresse){
        return  new ResponseEntity<>(addresseService.getAddresseById(idAddresse), HttpStatus.OK);
    }
    @PostMapping
    ResponseEntity<AddresseRequest> addAddresse(@RequestBody AddresseRequest addresseRequest){
        addresseService.addAddresse(addresseRequest);
        return new ResponseEntity<>(addresseRequest,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    ResponseEntity<Addresse> updateAddresse(@PathVariable("id") Long idAddress , @RequestBody AddresseRequest addresseRequest){
       return  new ResponseEntity<>(addresseService.updateAddresse(idAddress,addresseRequest),HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteAddresse(@PathVariable("id") Long idAddresse ){
        addresseService.deleteAddresse(idAddresse);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
