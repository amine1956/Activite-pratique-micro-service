package com.example.micro1.service;

import com.example.micro1.dto.InvoiceDtoResponce;
import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.entite.Invoice;
import com.example.micro1.mappers.InvoiceMappers;
import com.example.micro1.openFeign.CustmerRestClient;
import com.example.micro1.reposetorie.InvoiceReposetorie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceReposetorie invoiceReposetorie;

    @Autowired
    private InvoiceMappers invoiceMappers;


    private CustmerRestClient custmerRestClient;


    @Override
    public List<InvoiceDtoResponce> getAllInvoice() {
        return invoiceReposetorie.findAll()
                .stream()
                .map(invoiceMappers::InvoiceToInvoiceResponce)
                .collect(Collectors.toList());
    }


    @Override
    public InvoiceDtoResponce getInvoice(String id) {
        Invoice invoice = invoiceReposetorie.findById(id).get();
        System.out.println(invoice.getCustomer_id().toString());
        String idd=invoice.getCustomer_id().toString();
        System.out.println(custmerRestClient.getCustomer(idd));
        invoice.setCostmer(custmerRestClient.getCustomer(idd));
        System.out.println(invoice.getCostmer().toString());
        return invoiceMappers.InvoiceToInvoiceResponce(invoice);
    }

    @Override
    public InvoiceDtoResponce addInvoice(InvoiceDtoRequest CustmerDtoRequest) {
        Invoice invoice = invoiceMappers.InvoiceDtoRequestToInvoice(CustmerDtoRequest);
        invoice.setId(UUID.randomUUID().toString());
        invoice.setDate(new Date());
        invoiceReposetorie.save(invoice);
        return invoiceMappers.InvoiceToInvoiceResponce(invoice);
    }

    @Override
    public InvoiceDtoResponce updaytInvoice(String id, InvoiceDtoRequest InvoiceDtoRequest) {
        Invoice invoice = invoiceReposetorie.findById(id).get();
        invoice.setAmount(InvoiceDtoRequest.getAmount());

        invoiceReposetorie.save(invoice);
        return invoiceMappers.InvoiceToInvoiceResponce(invoice);
    }

    @Override
    public void deletInvoice(String id) {
        invoiceReposetorie.deleteById(id);

    }
}
