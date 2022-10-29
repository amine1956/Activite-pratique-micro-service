package com.example.micro1.dto;

import com.example.micro1.entite.Costmer;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDtoRequest {

    private BigDecimal amount;
    private Long customer_id;


    public InvoiceDtoRequest(BigDecimal amount, Long customer_id) {
        this.amount = amount;
        this.customer_id = customer_id;
    }

    public InvoiceDtoRequest() {
    }



    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
}
