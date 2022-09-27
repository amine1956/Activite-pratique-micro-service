package org.sid.microservice;

import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.CustmerRequestDTO;
import org.sid.microservice.entities.BanckAccount;
import org.sid.microservice.entities.Custmer;
import org.sid.microservice.enums.AccountType;
import org.sid.microservice.mappersAccount.MapperCustmer;
import org.sid.microservice.reposetories.BanckAccocuntReposetorie;
import org.sid.microservice.reposetories.CustmerReposetory;
import org.sid.microservice.service.AcountServices;
import org.sid.microservice.service.CustmerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroServiceApplication {
private MapperCustmer mapperCustmer=new MapperCustmer();
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApplication.class, args);
    }
@Bean
CommandLineRunner start(AcountServices acountServices, BanckAccocuntReposetorie banckAccocuntReposetorie, CustmerService custmerService, CustmerReposetory custmerReposetory){
        return args ->{



                Stream.of("amine","ayoub","jaouad").forEach(custmer->{
                    CustmerRequestDTO custmerRequestDTO= CustmerRequestDTO.builder()
                            .name(custmer)
                            .email(custmer+"@gmail.com")
                            .phone("0656565656")
                            .address("tunis")
                            .build();
                            System.out.println(custmerRequestDTO);
                    custmerService.addCustmer(custmerRequestDTO);
                });
                custmerService.getAllCustmer().forEach(custmer ->{
                    for (int i = 0; i <10; i++) {
                        AcountDtoRequest acountDtoInput=new AcountDtoRequest().builder()
                                .balance(1000.0).
                                createAt(new Date())
                                .type(AccountType.CURRENT)
                                .devise("MAD")
                                .custmer(mapperCustmer.fromCustmerResponseDTOToCustmerEntity(custmer))
                                .build();
                        System.out.println(mapperCustmer.FromResponseDTOToRequestDTO(custmer));
                        acountServices.addAccount(acountDtoInput);
                    }

                });


        };

        }
    }



