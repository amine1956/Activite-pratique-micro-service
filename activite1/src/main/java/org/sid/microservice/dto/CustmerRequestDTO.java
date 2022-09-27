package org.sid.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustmerRequestDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
//    private List<AcountDtoRequest> banckAccounts;

}
