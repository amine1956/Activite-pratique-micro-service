package org.sid.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustmerResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<AcountDtoResponse> banckAccounts;
}
