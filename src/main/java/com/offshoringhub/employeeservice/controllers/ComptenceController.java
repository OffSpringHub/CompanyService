package com.offshoringhub.employeeservice.controllers;

import com.offshoringhub.employeeservice.entities.Competence;
import com.offshoringhub.employeeservice.models.Competence.CompetenceRequest;
import com.offshoringhub.employeeservice.models.Competence.CompetenceResponse;
import com.offshoringhub.employeeservice.services.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/companyservice/competence")
public class ComptenceController {

    @Autowired
    CompetenceService competenceService;

    @PostMapping
    ResponseEntity<CompetenceResponse> addCompetence(@RequestBody CompetenceRequest competenceRequest) {
       CompetenceResponse com =competenceService.addCompetence(competenceRequest);
       return new ResponseEntity<>(com, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteCompetence(@PathVariable("id") Long idCompetence ){
        competenceService.deleteCompetence(idCompetence);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<CompetenceResponse> getCompetenceById(@PathVariable("id") Long idCompetence){
        return new ResponseEntity<>(competenceService.getCompetenceById(idCompetence),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    ResponseEntity<CompetenceResponse> updateCompetence(@PathVariable("id") Long idcompetence  , @RequestBody CompetenceRequest competenceRequest){
        return  new ResponseEntity<>(competenceService.updateComptence(idcompetence,competenceRequest),HttpStatus.OK);
    }


}
