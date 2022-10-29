package com.example.micro1;


import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.entite.Invoice;
import com.example.micro1.reposetorie.InvoiceReposetorie;
import com.example.micro1.service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
@EnableFeignClients
@SpringBootApplication
public class Micro1Application {

    public static void main(String[] args) {
        SpringApplication.run(Micro1Application.class, args);
    }
    @Bean CommandLineRunner commandLineRunner(InvoiceService invoiceService){

        return args -> {
            invoiceService.addInvoice(new InvoiceDtoRequest(new BigDecimal("1000"), 1L));
            invoiceService.addInvoice(new InvoiceDtoRequest(new BigDecimal("1000"), 2L));

            invoiceService.addInvoice(new InvoiceDtoRequest(new BigDecimal("1000"), 3L));

        };
    }
}