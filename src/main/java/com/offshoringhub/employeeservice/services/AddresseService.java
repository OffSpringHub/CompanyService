package com.offshoringhub.employeeservice.services;

import com.offshoringhub.employeeservice.entities.Addresse;
import com.offshoringhub.employeeservice.models.addresse.AddresseRequest;
import com.offshoringhub.employeeservice.models.addresse.AddresseResponse;

public interface AddresseService {

    void deleteAddresse(Long id);
    void addAddresse(AddresseRequest   addresseRequest);
    Addresse updateAddresse(Long id , AddresseRequest addresseRequest);
    AddresseResponse getAddresseById(Long id);
}
