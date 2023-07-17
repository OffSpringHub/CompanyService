package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.entities.Contact;
import com.offshoringhub.employeeservice.exceptions.exceptionModel.NotFoundException;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;
import com.offshoringhub.employeeservice.models.contact.ContactRequest;
import com.offshoringhub.employeeservice.models.contact.ContactResponse;
import com.offshoringhub.employeeservice.repositories.ContactRepository;
import com.offshoringhub.employeeservice.services.AddresseService;
import com.offshoringhub.employeeservice.services.ContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Autowired
    AddresseService addresseService ;

    @Override
    public void addContact(ContactRequest contactRequest) {
    Addresse     addresse= Addresse.builder()
            .numero(contactRequest.getAddresse().getNumero())
                .zipCode(contactRequest.getAddresse().getZipCode())
                .pays(contactRequest.getAddresse().getPays())
                .rue(contactRequest.getAddresse().getRue())
                .ville(contactRequest.getAddresse().getVille())
                .build();

        Contact contact = Contact.builder()
                .siteweb(contactRequest.getSiteweb())
                .email(contactRequest.getEmail())
                .Phone(contactRequest.getPhone())
                .addresse(addresse)
                .build();
        contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Long idContact) {
        Contact contact  = contactRepository.findById(idContact).orElseThrow(()->new NotFoundException("Contact not found"));
        contactRepository.delete(contact);
    }

    @Override
    public ContactResponse updateContact(Long idContact, ContactRequest contactRequest) {
        Contact contact =  contactRepository.findById(idContact).orElseThrow(()->new NotFoundException("Contact not found"));
        Addresse addresse = Addresse.builder()
                .idAddresse(contactRequest.getAddresse().getIdAddresse())
                .numero(contactRequest.getAddresse().getNumero())
                .zipCode(contactRequest.getAddresse().getZipCode())
                .pays(contactRequest.getAddresse().getPays())
                .rue(contactRequest.getAddresse().getRue())
                .build();
        contact.setAddresse(addresse);
        contact.setEmail(contactRequest.getEmail());
        contact.setSiteweb(contactRequest.getSiteweb());
        contact.setPhone(contactRequest.getPhone());
        contactRepository.save(contact);
        return null;
    }

    @Override
    public ContactResponse findByContactById(Long id) {
        Contact contact =  contactRepository.findById(id).orElseThrow(()->new NotFoundException("Contact not found"));
        AddresseResponse addresseResponse = new AddresseResponse();
        BeanUtils.copyProperties(contact.getAddresse(),addresseResponse);
        return ContactResponse
                .builder()
                .Phone(contact.getPhone())
                .email(contact.getEmail())
                .siteweb(contact.getSiteweb())
                .addresse(addresseResponse)
                .build();
    }
}
