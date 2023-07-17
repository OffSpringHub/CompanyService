package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.models.societe.SocieteRequest;
import com.offshoringhub.employeeservice.models.societe.SocieteResponse;

public interface SocieteService {
    void addSociete(SocieteRequest societeRequest);

    void updateService(Long idsociete, SocieteRequest societeRequest);

    void deleteSociete(Long idsociete);

    SocieteResponse getSocieteByService(Long idsociete);
}
