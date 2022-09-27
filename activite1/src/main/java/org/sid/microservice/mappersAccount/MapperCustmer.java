package org.sid.microservice.mappersAccount;

import org.sid.microservice.dto.CustmerRequestDTO;
import org.sid.microservice.dto.CustmerResponseDTO;
import org.sid.microservice.entities.Custmer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service

public class MapperCustmer {


    CustmerRequestDTO fromCustmerEntityToCustmeRequestDTO(CustmerRequestDTO custmerRequestDTO) {
        CustmerRequestDTO custmerRequestDTO1 = new CustmerRequestDTO();
        BeanUtils.copyProperties(custmerRequestDTO, custmerRequestDTO1);
        return custmerRequestDTO1;
    }

    public Custmer fromCustmerRequestDTOToCustmerEntity(CustmerRequestDTO custmerRequestDTO) {
        Custmer custmer = new Custmer();
        BeanUtils.copyProperties(custmerRequestDTO, custmer);
        return custmer;

    }
    public Custmer fromCustmerResponseDTOToCustmerEntity(CustmerResponseDTO custmerResponseDTO) {
        Custmer custmer = new Custmer();
        BeanUtils.copyProperties(custmerResponseDTO, custmer);
        return custmer;

    }
   public CustmerResponseDTO FromeCustmerToCustmerResponseDTO(Custmer custmer){
        CustmerResponseDTO custmerResponseDTO=new CustmerResponseDTO();
        BeanUtils.copyProperties(custmer,custmerResponseDTO);
        return custmerResponseDTO;

    }
    public  CustmerRequestDTO FromResponseDTOToRequestDTO(CustmerResponseDTO custmerResponseDTO){
        CustmerRequestDTO custmerRequestDTO=new CustmerRequestDTO();
        BeanUtils.copyProperties(custmerResponseDTO,custmerRequestDTO);
        return custmerRequestDTO;

    }

}

