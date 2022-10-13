package com.example.micro2.web;

import com.example.micro2.reposetorie.ProductReposetorie;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class ProductWeb {

    private ProductReposetorie productReposetorie;
    @GetMapping("/products")
    public Object getProducts(){
        return productReposetorie.findAll();
    }

}
