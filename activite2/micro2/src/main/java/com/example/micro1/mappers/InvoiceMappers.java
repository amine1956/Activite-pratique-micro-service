package com.example.micro1.mappers;

import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.dto.InvoiceDtoResponce;
import com.example.micro1.entite.Invoice;
import org.mapstruct.Mapper;



public interface InvoiceMappers {
    InvoiceDtoResponce InvoiceToInvoiceResponce(Invoice invoice);
    Invoice InvoiceDtoResponceToInvoice(InvoiceDtoResponce invoiceDtoResponce);

    InvoiceDtoRequest InvoiceToInvoiceDtoRequest(Invoice invoice);
    Invoice InvoiceDtoRequestToInvoice(InvoiceDtoRequest invoiceDtoRequest);

}

