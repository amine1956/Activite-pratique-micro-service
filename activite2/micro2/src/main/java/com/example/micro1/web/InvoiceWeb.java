package com.example.micro1.web;

import com.example.micro1.dto.InvoiceDtoResponce;
import com.example.micro1.dto.InvoiceDtoRequest;
import com.example.micro1.reposetorie.InvoiceReposetorie;
import com.example.micro1.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class InvoiceWeb {
    @Autowired
    private InvoiceReposetorie invoiceReposetorie;
    @Autowired
    private InvoiceService invoiceService;
    @GetMapping("/invoice")
    public List<InvoiceDtoResponce> getAllInvoice() {
        return invoiceService.getAllInvoice();
    }
    @GetMapping("/invoice/{id}")
    public InvoiceDtoResponce getInvoice(@PathVariable String id) {
        return invoiceService.getInvoice(id);
    }
    @PostMapping("/invoice")
    public InvoiceDtoResponce addInvoice(@RequestBody InvoiceDtoRequest invoiceDtoRequest) {
        return invoiceService.addInvoice(invoiceDtoRequest);
    }
    @PutMapping("/invoice/{id}")
    public InvoiceDtoResponce updaytInvoice(@PathVariable String id, @RequestBody InvoiceDtoRequest invoiceDtoRequest) {
        return invoiceService.updaytInvoice(id, invoiceDtoRequest);
    }
    @DeleteMapping("/invoice/{id}")
    public void deletInvoice(@PathVariable String id) {
        invoiceService.deletInvoice(id);
    }




}
