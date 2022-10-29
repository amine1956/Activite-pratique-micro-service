package com.example.micro1.mappers;

import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.dto.InvoiceDtoResponce;
import com.example.micro1.entite.Invoice;
import org.springframework.stereotype.Service;

@Service

public class InvoiceMappersImpl implements InvoiceMappers {
    @Override
    public InvoiceDtoResponce InvoiceToInvoiceResponce(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }
        InvoiceDtoResponce invoiceDtoResponce = new InvoiceDtoResponce();
        invoiceDtoResponce.setAmount( invoice.getAmount() );
        invoiceDtoResponce.setCustomer_id( invoice.getCustomer_id() );
        invoiceDtoResponce.setId( invoice.getId() );
        invoiceDtoResponce.setDate( invoice.getDate() );
        invoiceDtoResponce.setCostmer( invoice.getCostmer() );

        return invoiceDtoResponce;
    }

    @Override
    public Invoice InvoiceDtoResponceToInvoice(InvoiceDtoResponce invoiceDtoResponce) {
        if ( invoiceDtoResponce == null ) {
            return null;
        }
        Invoice invoice = new Invoice();
        invoice.setAmount( invoiceDtoResponce.getAmount() );
        invoice.setCustomer_id( invoiceDtoResponce.getCustomer_id() );
        invoice.setId( invoiceDtoResponce.getId() );
        invoice.setDate( invoiceDtoResponce.getDate() );
        invoice.setCostmer( invoiceDtoResponce.getCostmer() );

        return invoice;
    }

    @Override
    public InvoiceDtoRequest InvoiceToInvoiceDtoRequest(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }
        InvoiceDtoRequest invoiceDtoRequest = new InvoiceDtoRequest();
        invoiceDtoRequest.setAmount( invoice.getAmount() );
        invoiceDtoRequest.setCustomer_id( invoice.getCustomer_id() );

        return invoiceDtoRequest;
    }

    @Override
    public Invoice InvoiceDtoRequestToInvoice(InvoiceDtoRequest invoiceDtoRequest) {
        if ( invoiceDtoRequest == null ) {
            return null;
        }
        Invoice invoice = new Invoice();
        invoice.setAmount( invoiceDtoRequest.getAmount() );
        invoice.setCustomer_id( invoiceDtoRequest.getCustomer_id() );
        return invoice;
    }
}
