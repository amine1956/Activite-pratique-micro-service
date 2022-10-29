package com.example.micro1.dto;


import com.example.micro1.entite.Costmer;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDtoResponce {
    private String id;
    private Date date;
    private BigDecimal amount;
    private Long customer_id;
    private Costmer costmer;


    public InvoiceDtoResponce(String id, Date date, BigDecimal amount, Long customer_id, Costmer costmer) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.customer_id = customer_id;
        this.costmer = costmer;
    }

    public InvoiceDtoResponce() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Costmer getCostmer() {
        return costmer;
    }

    public void setCostmer(Costmer costmer) {
        this.costmer = costmer;
    }
}
