package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Socials;
import com.offshoringhub.employeeservice.exceptions.addresse.NotFoundException;
import com.offshoringhub.employeeservice.models.socials.SocialRest;
import com.offshoringhub.employeeservice.repositories.SocialsRepository;
import com.offshoringhub.employeeservice.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialServiceImpl implements SocialService {
    @Autowired
    SocialsRepository socialsRepository;
    @Override
    public SocialRest addSocial(SocialRest social) {
        Socials socials = Socials.builder()
                .libelle(social.getLibelle())
                .link(social.getLink())
                .build();
        socialsRepository.save(socials);
        return social ;
    }

    @Override
    public SocialRest updateSocial(Long id, SocialRest socialRest) {
        Socials socials = socialsRepository.findById(id).orElseThrow(()->new NotFoundException("social not found"));
        socials.setLink(socialRest.getLink());
        socials.setLibelle(socialRest.getLibelle());
        socialsRepository.save(socials);

        return null;
    }

    @Override
    public void deleteSocial(Long id) {
        Socials socials = socialsRepository.findById(id).orElseThrow(()->new NotFoundException("social not found"));
        socialsRepository.delete(socials);
    }

    @Override
    public SocialRest getSocialByID(Long id) {
        Socials socials = socialsRepository.findById(id).orElseThrow(()->new NotFoundException("social not found"));
        return SocialRest.builder()
                .libelle(socials.getLibelle())
                .link(socials.getLink())
                .build();
    }
}
