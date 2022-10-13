package com.example.micro2;

import com.example.micro2.entitie.Product;
import com.example.micro2.reposetorie.ProductReposetorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Micro2Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro2Application.class, args);
    }
@Bean
CommandLineRunner start(ProductReposetorie productReposetorie){
        return args -> {
            productReposetorie.save(new Product(null,"ordinateur",1000,2));
            productReposetorie.save(new Product(null,"imprimante",2000,2 ));
            productReposetorie.save(new Product(null,"telephone",3000,3));
        };
    }
}
