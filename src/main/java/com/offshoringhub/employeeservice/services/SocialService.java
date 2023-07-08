package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.models.socials.SocialRest;

public interface SocialService {

    SocialRest addSocial(SocialRest socialRest);
    SocialRest updateSocial(Long id , SocialRest socialRest);
    void deleteSocial(Long id);
    SocialRest getSocialByID(Long id);
}
