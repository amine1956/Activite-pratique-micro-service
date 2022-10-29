package com.example.demo132;

import com.example.demo132.dto.CustmerDtoRequest;
import com.example.demo132.service.CustemersService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo132Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo132Application.class, args);
    }
    @Bean
    CommandLineRunner start(CustemersService custemersService){

        return args -> {
            custemersService.addCustomer(new CustmerDtoRequest(null,"ali","amineklm983@gmai.com"));
            custemersService.addCustomer(new CustmerDtoRequest(null,"amine","amineklm983@gmai.com"));
            custemersService.addCustomer(new CustmerDtoRequest(null,"ayoub","amineklm983@gmai.com"));
            custemersService.addCustomer(new CustmerDtoRequest(null,"jaouad","amineklm983@gmai.com"));


        };
    }

}
