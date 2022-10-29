package com.example.micro1.entite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Invoice {
    @Id

     private String id;
    private Date date;
    private BigDecimal amount;
    private Long customer_id;
    @Transient
    private Costmer costmer;

    public Invoice() {
    }
    public Invoice(String id, Date date, BigDecimal amount, Long customer_id) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.customer_id = customer_id;
    }

    public Invoice(Object o, String s, BigDecimal bigDecimal) {
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
