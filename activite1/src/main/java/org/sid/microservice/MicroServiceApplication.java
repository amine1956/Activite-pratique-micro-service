package org.sid.microservice;

import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.enums.AccountType;
import org.sid.microservice.service.AcountServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class MicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
    }
@Bean
CommandLineRunner start(AcountServices acountServices){
        return args -> {
            for (int i = 0; i <10; i++) {
                AcountDtoRequest acountDtoInput=new AcountDtoRequest().builder()
                        .id(UUID.randomUUID().toString())
                        .balance(1000.0).
                        createAt(new Date())
                        .type(AccountType.CURRENT)
                        .devise("MAD")
                        .build();
                acountServices.addAccount(acountDtoInput);
            }

        };
        }
    }



