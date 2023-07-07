package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.entities.Competence;
import com.offshoringhub.employeeservice.models.Competence.CompetenceRequest;
import com.offshoringhub.employeeservice.models.Competence.CompetenceResponse;

public interface CompetenceService {

    CompetenceResponse addCompetence( CompetenceRequest competenceRequest);
    CompetenceResponse updateComptence(Long id , CompetenceRequest competenceRequest);

    void deleteCompetence(Long id );
    CompetenceResponse getCompetenceById(Long id);


}
