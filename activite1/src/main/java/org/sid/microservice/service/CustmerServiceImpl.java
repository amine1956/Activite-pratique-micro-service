package org.sid.microservice.service;

import lombok.AllArgsConstructor;
import org.sid.microservice.dto.CustmerRequestDTO;
import org.sid.microservice.dto.CustmerResponseDTO;
import org.sid.microservice.entities.Custmer;
import org.sid.microservice.mappersAccount.MapperCustmer;
import org.sid.microservice.reposetories.CustmerReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
@AllArgsConstructor
public class CustmerServiceImpl implements CustmerService {
    @Autowired
    private CustmerReposetory custmerReposetory;

    private MapperCustmer mapperCustmer;



    @Override
    public CustmerResponseDTO addCustmer(CustmerRequestDTO custmerRequestDTO) {

        return mapperCustmer.FromeCustmerToCustmerResponseDTO(custmerReposetory.save(mapperCustmer.fromCustmerRequestDTOToCustmerEntity(custmerRequestDTO)));

    }

    @Override
    public void deleteCustmer(Long id) {
        custmerReposetory.deleteById(id);

    }

    @Override
    public CustmerResponseDTO updateCustmer(CustmerRequestDTO custmerRequestDTO, String id) {
return mapperCustmer.FromeCustmerToCustmerResponseDTO(custmerReposetory.save(mapperCustmer.fromCustmerRequestDTOToCustmerEntity(custmerRequestDTO)));

    }

    @Override
    public CustmerResponseDTO getCustmer(Long id) {
        return mapperCustmer.FromeCustmerToCustmerResponseDTO(custmerReposetory.findById(id).get());

    }

    @Override
    public List<CustmerResponseDTO> getAllCustmer() {
        return custmerReposetory.findAll().stream().map(mapperCustmer::FromeCustmerToCustmerResponseDTO).collect(Collectors.toList());

    }


}
