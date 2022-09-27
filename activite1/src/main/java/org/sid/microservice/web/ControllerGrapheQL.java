package org.sid.microservice.web;

import lombok.AllArgsConstructor;
import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.AcountDtoResponse;
import org.sid.microservice.dto.CustmerResponseDTO;
import org.sid.microservice.entities.Custmer;
import org.sid.microservice.enums.AccountType;
import org.sid.microservice.reposetories.CustmerReposetory;
import org.sid.microservice.service.AcountServices;
import org.sid.microservice.service.CustmerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;
@Controller
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class ControllerGrapheQL {
    private AcountServices acountServices;
    private CustmerReposetory custmerReposetory;
    @QueryMapping
    public List<AcountDtoResponse> getAllAcountes() {
        return acountServices.getAllAcount();
    }
    @QueryMapping
    public AcountDtoResponse getAccountf(@Argument  String id) {
        return acountServices.getAccount(id);
    }
    @MutationMapping
    public AcountDtoResponse addAccounte(@Argument AcountDtoRequest acountDtoInput) {
        acountDtoInput.setCreateAt(new Date());
        acountDtoInput.setDevise("DZD");
        acountDtoInput.setType(AccountType.CURRENT);
        return acountServices.addAccount(acountDtoInput);
    }


    @MutationMapping
    public String deleteAccounte(@Argument String id) {
        acountServices.deleteAccount(id);
        return "Account deleted";
    }

    @MutationMapping
    public AcountDtoResponse updateAccounte(@Argument AcountDtoRequest acountDtoInput, @Argument String id) {
        return acountServices.updateAccount(acountDtoInput, id);
    }
    @QueryMapping
    public List<Custmer> getAllCustmer() {
        return custmerReposetory.findAll();
    }
}
