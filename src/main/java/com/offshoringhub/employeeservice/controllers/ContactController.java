package com.offshoringhub.employeeservice.controllers;


import com.offshoringhub.employeeservice.entities.Contact;
import com.offshoringhub.employeeservice.models.contact.ContactRequest;
import com.offshoringhub.employeeservice.models.contact.ContactResponse;
import com.offshoringhub.employeeservice.services.ContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/contact")
public class ContactController {

    @Autowired
    ContactService contactService;


    @RequestMapping("/{id}")
    ResponseEntity<ContactResponse> getContactById(@PathVariable("id") Long idcontact){
        return new ResponseEntity<>(contactService.findByContactById(idcontact), HttpStatus.OK);

    }

    @PostMapping
    ResponseEntity<Void> addContact(@RequestBody ContactRequest contactRequest){
        contactService.addContact(contactRequest);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteContact(@PathVariable("id") Long idContact){
        contactService.deleteContact(idContact);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    ResponseEntity<Void> updateContact(@PathVariable("id") Long idContact , @RequestBody  ContactRequest contactRequest){
        contactService.updateContact(idContact,contactRequest);
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
