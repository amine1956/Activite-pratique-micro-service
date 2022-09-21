package org.sid.microservice.service;


import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.AcountDtoResponse;

import java.util.List;


public interface AcountServices {
    AcountDtoResponse addAccount(AcountDtoRequest acountDtoInput);
    void deleteAccount(String id);

    AcountDtoResponse updateAccount(AcountDtoRequest acountDtoInput, String id);

    AcountDtoResponse getAccount(String id);
    List<AcountDtoResponse> getAllAcount();


}
