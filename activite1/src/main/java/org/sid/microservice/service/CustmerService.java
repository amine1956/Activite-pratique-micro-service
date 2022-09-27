package org.sid.microservice.service;

import org.sid.microservice.dto.CustmerRequestDTO;
import org.sid.microservice.dto.CustmerResponseDTO;
import org.sid.microservice.entities.Custmer;

import java.util.List;

public interface CustmerService {

    CustmerResponseDTO addCustmer(CustmerRequestDTO custmerRequestDTO);
    void deleteCustmer(Long id);

    CustmerResponseDTO updateCustmer(CustmerRequestDTO custmerRequestDTO, String id);

    CustmerResponseDTO getCustmer(Long id);
    List<CustmerResponseDTO> getAllCustmer();

}
