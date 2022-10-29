package com.example.micro1.service;

import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.dto.InvoiceDtoResponce;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {
    List<InvoiceDtoResponce> getAllInvoice();
    InvoiceDtoResponce getInvoice(String id);
    InvoiceDtoResponce addInvoice(InvoiceDtoRequest invoiceDtoRequest);
    InvoiceDtoResponce updaytInvoice(String id, InvoiceDtoRequest invoiceDtoRequest);
    void deletInvoice(String id);



}
