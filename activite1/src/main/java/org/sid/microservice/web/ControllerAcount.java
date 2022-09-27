package org.sid.microservice.web;

import lombok.AllArgsConstructor;
import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.AcountDtoResponse;
import org.sid.microservice.dto.CustmerResponseDTO;
import org.sid.microservice.reposetories.BanckAccocuntReposetorie;
import org.sid.microservice.service.AcountServices;
import org.sid.microservice.service.CustmerService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@AllArgsConstructor
@CrossOrigin("*")
public class ControllerAcount {
    private AcountServices acountServices;
    private BanckAccocuntReposetorie banckAccocuntReposetorie;
    private CustmerService custmerService;
    @PostMapping("/addAccount")
    public AcountDtoResponse addAccount(@RequestBody AcountDtoRequest acountDtoInput) {
        return acountServices.addAccount(acountDtoInput);
    }

    @GetMapping("/getAccount/{id}")
    public AcountDtoResponse getAccount(@PathVariable String id) {
        return acountServices.getAccount(id);
    }
@GetMapping("/getAllAcountese")
    public List<CustmerResponseDTO> getAllAcountes() {

    return custmerService.getAllCustmer();
    }

    @GetMapping("/getAllAcount")
    public List<AcountDtoResponse> getAllAcount() {
        return acountServices.getAllAcount();
    }

    @DeleteMapping("/deleteAccount/{id}")
    public void deleteAccount(@PathVariable String id) {
        acountServices.deleteAccount(id);
    }

    @PutMapping("/updateAccount/{id}")
    public AcountDtoResponse updateAccount(@RequestBody AcountDtoRequest acountDtoInput, @PathVariable String id) {
        return acountServices.updateAccount(acountDtoInput, id);
    }

}



