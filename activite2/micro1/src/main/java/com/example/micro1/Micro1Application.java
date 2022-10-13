package com.example.micro1;

import com.example.micro1.entite.Custmer;
import com.example.micro1.reposetorie.CustmerReposetorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Micro1Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro1Application.class, args);
    }

    @Bean
    CommandLineRunner start(CustmerReposetorie custmerReposetorie) {
        return args -> {
            custmerReposetorie.save(new Custmer(null, "mohamed", "amineklm93@gmail.com"));
            custmerReposetorie.save(new Custmer(null, "amine", "kfkkkf@gmail.com"));

        };
    }
}