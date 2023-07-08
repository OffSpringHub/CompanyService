package com.offshoringhub.employeeservice.controllers;

import com.offshoringhub.employeeservice.models.socials.SocialRest;
import com.offshoringhub.employeeservice.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/socials")
public class SocialsController {
    @Autowired
    SocialService socialService;
    @PostMapping
    ResponseEntity<SocialRest> addSocial(@RequestBody SocialRest socialRest){
        socialService.addSocial(socialRest);
        return new ResponseEntity<>(socialRest , HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteSocial(@PathVariable("id") Long idSocial){
        socialService.deleteSocial(idSocial);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    ResponseEntity<SocialRest> updateSocial(@PathVariable("id") Long idSocial, @RequestBody SocialRest socialRest){
        return new ResponseEntity<>(socialService.updateSocial(idSocial,socialRest) , HttpStatus.OK);
    }
    @GetMapping("{id}")
    ResponseEntity<SocialRest> getSocialById(@PathVariable("id") Long idSocial){
        return new ResponseEntity<>(socialService.getSocialByID(idSocial),HttpStatus.FOUND);
    }

}
