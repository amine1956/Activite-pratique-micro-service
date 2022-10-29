package com.example.demo132.service;

import com.example.demo132.dto.CusrmerDtoResponce;
import com.example.demo132.dto.CustmerDtoRequest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustemersService {
    List<CusrmerDtoResponce> getAllCustomers();
    CusrmerDtoResponce getCustomerById(Long id);
    CusrmerDtoResponce addCustomer(CustmerDtoRequest CustmerDtoRequest);
    CusrmerDtoResponce updateCustomer(Long id, CustmerDtoRequest CustmerDtoRequest);
    void deleteCustomer(Long id);



}
