package com.example.micro1.web;

import com.example.micro1.reposetorie.CustmerReposetorie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class CustemrWeb {
    private  CustmerReposetorie custmerReposetorie;
    @GetMapping("/customers")
    public Object getCustomers(){
        return custmerReposetorie.findAll();
    }
    @GetMapping("/customers/{id}")
    public Object getCustomerById(){
        return custmerReposetorie.findAll();
    }

}
