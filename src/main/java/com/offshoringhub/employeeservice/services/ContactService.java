package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.models.contact.ContactRequest;
import com.offshoringhub.employeeservice.models.contact.ContactResponse;

public interface ContactService {
    void addContact(ContactRequest contactRequest);
    void deleteContact(Long idContact);
    ContactResponse updateContact(Long idContact , ContactRequest contactRequest);

    ContactResponse findByContactById(Long id);
}
