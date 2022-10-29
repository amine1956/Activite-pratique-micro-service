package com.example.micro1.openFeign;

import com.example.micro1.entite.Costmer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustmerRestClient {
     @GetMapping(path="/customers/{id}")
     Costmer getCustomer(@PathVariable(name = "id") String id);


}
