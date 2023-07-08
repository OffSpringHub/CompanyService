package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.entities.Contact;
import com.offshoringhub.employeeservice.exceptions.addresse.NotFoundException;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.contact.ContactRequest;
import com.offshoringhub.employeeservice.models.contact.ContactResponse;
import com.offshoringhub.employeeservice.repositories.ContactRepository;
import com.offshoringhub.employeeservice.services.AddresseService;
import com.offshoringhub.employeeservice.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Autowired
    AddresseService addresseService ;
    @Override
    public ContactResponse getContactById(Long idcontact) {
        Contact contact = contactRepository.findById(idcontact).orElseThrow(()-> new NotFoundException("Contact not found"));
        AddresseRequest addresse = AddresseRequest.builder()
                .pays(contact.getAddresse().getPays())
                .numero(contact.getAddresse().getNumero())
                .zipCode(contact.getAddresse().getZipCode())
                .rue(contact.getAddresse().getRue())
                .build();

        return ContactResponse.
                builder()
                .email(contact.getEmail())
                .siteweb(contact.getSiteweb())
                .addresse(addresse)
                .Phone(contact.getPhone())
                .build();
    }

    @Override
    public ContactResponse addContact(ContactRequest contactRequest) {
        return null;
    }

    @Override
    public void deleteContact(Long idContact) {
        contactRepository.deleteById(idContact);
    }

    @Override
    public ContactResponse updateContact(Long idContact, ContactRequest contactRequest) {
        return null;
    }
}
