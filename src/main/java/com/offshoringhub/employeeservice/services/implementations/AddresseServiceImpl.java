package com.offshoringhub.employeeservice.services.implementations;

import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.exceptions.addresse.NotFoundException;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;
import com.offshoringhub.employeeservice.repositories.AddresseRepository;
import com.offshoringhub.employeeservice.services.AddresseService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AddresseServiceImpl implements AddresseService {

    @Autowired
    AddresseRepository addresseRepository;

    @Override
    public void deleteAddresse(Long id) {
        addresseRepository.deleteById(id);
    }

    @Override
    public void addAddresse(AddresseRequest addresseRequest) {
        Addresse addresse = Addresse.builder()
                .rue(addresseRequest.getRue())
                .ville(addresseRequest.getVille())
                .pays(addresseRequest.getPays())
                .zipCode(addresseRequest.getZipCode())
                .numero(addresseRequest.getNumero())
                .build();
        addresseRepository.save(addresse);
    }

    @Override
    public Addresse updateAddresse(Long id , AddresseRequest addresseRequest) {
        Addresse addresse = addresseRepository.findById(id).orElseThrow(()->new NotFoundException("Addresse not found"));
        addresse.setPays(addresse.getPays());
        addresse.setRue(addresseRequest.getRue());
        addresse.setVille(addresseRequest.getVille());
        addresse.setZipCode(addresseRequest.getZipCode());
        addresse.setNumero(addresse.getNumero());
        addresseRepository.save(addresse);
        return addresse;
    }

    @Override
    public AddresseResponse getAddresseById(Long id) {
        Addresse addresse  = addresseRepository.findById(id).orElseThrow(()->new NotFoundException("Addresse not found"));
        return AddresseResponse.builder()
                .rue(addresse.getRue())
                .ville(addresse.getVille())
                .pays(addresse.getPays())
                .numero(addresse.getNumero())
                .zipCode(addresse.getZipCode())
                .build();
    }
}
