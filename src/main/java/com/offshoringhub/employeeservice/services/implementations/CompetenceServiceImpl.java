package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Competence;
import com.offshoringhub.employeeservice.exceptions.exceptionModel.NotFoundException;
import com.offshoringhub.employeeservice.models.Competence.CompetenceRequest;
import com.offshoringhub.employeeservice.models.Competence.CompetenceResponse;
import com.offshoringhub.employeeservice.repositories.CompetenceRepository;
import com.offshoringhub.employeeservice.services.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CompetenceServiceImpl implements CompetenceService {
    @Autowired
    CompetenceRepository competenceRepository;
    @Override
    public CompetenceResponse addCompetence(CompetenceRequest competenceRequest) {
        Competence competence = Competence.builder()
                .libelle(competenceRequest.getTitre())
                .build();
        competenceRepository.save(competence);
        return new CompetenceResponse(competence.getLibelle());
    }

    @Override
    public CompetenceResponse updateComptence(Long id, CompetenceRequest competenceRequest) {
        Competence competence = competenceRepository.findById(id).orElseThrow(()->new NotFoundException("Competence Not Found"));
        competence.setLibelle(competenceRequest.getTitre());
        competenceRepository.save(competence);

        return new CompetenceResponse(competence.getLibelle());
    }

    @Override
    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }

    @Override
    public CompetenceResponse getCompetenceById(Long id) {
        Competence com =  competenceRepository.findById(id).orElseThrow(()->new NotFoundException("Competence Not Found"));
        return CompetenceResponse.builder()
                .titre(com.getLibelle())
                .build();
    }
}
