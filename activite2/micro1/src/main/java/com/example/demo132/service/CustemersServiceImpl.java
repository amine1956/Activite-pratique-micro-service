package com.example.demo132.service;

import com.example.demo132.dto.CusrmerDtoResponce;
import com.example.demo132.dto.CustmerDtoRequest;
import com.example.demo132.entite.Custmer;
import com.example.demo132.mappers.CustmersMappers;
import com.example.demo132.reposetorie.CustmerReposetorie;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class CustemersServiceImpl implements CustemersService {
    @Autowired
    private CustmerReposetorie custmerReposetorie;
    @Autowired
    private CustmersMappers custmersMappers;
    @Override
    public List<CusrmerDtoResponce> getAllCustomers() {
        List<Custmer> custmers= custmerReposetorie.findAll();
        List<CusrmerDtoResponce> cusrmerDtoResponces = custmers.stream().map(account ->
        custmersMappers.CustmerToCustmerResponce(account)).collect(Collectors.toList());
       return  cusrmerDtoResponces;

    }



    @Override
    public CusrmerDtoResponce getCustomerById(Long id) {
        Custmer custmer= custmerReposetorie.findById(id).get();
        return custmersMappers.CustmerToCustmerResponce(custmer);
    }

    @Override
    public CusrmerDtoResponce addCustomer(CustmerDtoRequest CustmerDtoRequest) {
        Custmer custmer= custmersMappers.CustmerDtoRequestToCustmer(CustmerDtoRequest);
        custmerReposetorie.save(custmer);
        return custmersMappers.CustmerToCustmerResponce(custmer);
    }

    @Override
    public CusrmerDtoResponce updateCustomer(Long id, CustmerDtoRequest CustmerDtoRequest) {
        Custmer custmer= custmersMappers.CustmerDtoRequestToCustmer(CustmerDtoRequest);
        custmer.setId(id);
        custmerReposetorie.save(custmer);
        return custmersMappers.CustmerToCustmerResponce(custmer);
    }

    @Override
    public void deleteCustomer(Long id) {
        custmerReposetorie.deleteById(id);

    }
}
