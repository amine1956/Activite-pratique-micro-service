package org.sid.microservice.mappersAccount;


import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.AcountDtoResponse;
import org.sid.microservice.entities.BanckAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service

public class MapperAcount {
AcountDtoRequest fromAccountEntityToAccountInputDTO(BanckAccount banckAccount){
    AcountDtoRequest acountDtoInput=new AcountDtoRequest();
    BeanUtils.copyProperties(banckAccount,acountDtoInput);
return acountDtoInput;
}
public BanckAccount fromAccountInputDTOToAccountEntity(AcountDtoRequest acountDtoInput){
    BanckAccount banckAccount=new BanckAccount();
    BeanUtils.copyProperties(acountDtoInput,banckAccount);
    return banckAccount;

}
public AcountDtoResponse FromeBanckAccountToAccountOutputDTO(BanckAccount banckAccount){
AcountDtoResponse acountDtoOutput=new AcountDtoResponse();
    BeanUtils.copyProperties(banckAccount,acountDtoOutput);
    return acountDtoOutput;

}
}






