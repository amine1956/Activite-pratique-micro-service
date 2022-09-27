package org.sid.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.microservice.entities.BanckAccount;
import org.sid.microservice.entities.Custmer;
import org.sid.microservice.enums.AccountType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AcountDtoRequest {
    private String id;
    private Double balance;
    private java.util.Date createAt;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private  String devise;
    private Custmer custmer;

}
