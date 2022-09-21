package org.sid.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.microservice.enums.AccountType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BanckAccount {
    @Id
    private String id;
    private Double balance;
    private java.util.Date createAt;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private  String devise;

}
