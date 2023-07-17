package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Societe;
import com.offshoringhub.employeeservice.exceptions.exceptionModel.NotFoundException;
import com.offshoringhub.employeeservice.models.societe.SocieteRequest;
import com.offshoringhub.employeeservice.models.societe.SocieteResponse;
import com.offshoringhub.employeeservice.repositories.SocieteRepository;
import com.offshoringhub.employeeservice.services.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SocieteServiceImpl implements SocieteService {

    @Autowired
    SocieteRepository societeRepository;


    @Override
    public void addSociete(SocieteRequest societeRequest) {
        Societe societe = Societe.builder()
                .contact(societeRequest.getContact())
                .nomLegal(societeRequest.getNomLegal())
                .logoLink(societeRequest.getLogoLink())
                .build();
        societeRepository.save(societe);
    }

    @Override
    public void updateService(Long idsociete, SocieteRequest societeRequest) {
        Societe societe = societeRepository.findById(idsociete).orElseThrow(()-> new NotFoundException("societe not found"));
        societe.setContact(societeRequest.getContact());
        societe.setLogoLink(societeRequest.getLogoLink());
        societe.setNomLegal(societeRequest.getNomLegal());
    }

    @Override
    public void deleteSociete(Long idsociete) {
        Societe societe = societeRepository.findById(idsociete).orElseThrow(()->new NotFoundException("societé not found"));
        societeRepository.delete(societe);
    }

    @Override
    public SocieteResponse getSocieteByService(Long idsociete) {
        Societe societe= societeRepository.findById(idsociete).orElseThrow(()-> new NotFoundException("Societé not found"));
        return SocieteResponse.builder()
                .idSociete(societe.getIdSociete())
                .contact(societe.getContact())
                .logoLink(societe.getLogoLink())
                .nomLegal(societe.getNomLegal())
                .build();
    }


}
