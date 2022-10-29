package com.example.demo132.web;


import com.example.demo132.dto.CusrmerDtoResponce;
import com.example.demo132.dto.CustmerDtoRequest;
import com.example.demo132.reposetorie.CustmerReposetorie;
import com.example.demo132.service.CustemersService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class CustemrWeb {
    @Autowired
    private CustmerReposetorie custmerReposetorie;
    @Autowired
    private CustemersService custemersService;
    @GetMapping("/customers")
    public List<CusrmerDtoResponce>  getCustomers(){
        return custemersService.getAllCustomers();

    }
    @GetMapping("/customers/{id}")
    public CusrmerDtoResponce getCustomersById(@PathVariable Long id){
        return custemersService.getCustomerById(id);
    }
@PostMapping("/customers")
    public CusrmerDtoResponce addCustomer(@RequestBody CustmerDtoRequest custmerDtoRequest){
        return custemersService.addCustomer(custmerDtoRequest);
    }
    @PutMapping("/customers/{id}")
    public CusrmerDtoResponce updateCustomer(@PathVariable Long id,@RequestBody CustmerDtoRequest custmerDtoRequest){
        return custemersService.updateCustomer(id,custmerDtoRequest);
    }
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id){
        custemersService.deleteCustomer(id);
    }




}
