package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.models.contact.ContactRequest;
import com.offshoringhub.employeeservice.models.contact.ContactResponse;

public interface ContactService {
    ContactResponse getContactById(Long idcontact);
    ContactResponse addContact(ContactRequest contactRequest);
    void deleteContact(Long idContact);
    ContactResponse updateContact(Long idContact , ContactRequest contactRequest);
}
