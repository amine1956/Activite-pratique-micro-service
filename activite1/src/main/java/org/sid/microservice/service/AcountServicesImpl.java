package org.sid.microservice.service;


import lombok.AllArgsConstructor;
import org.sid.microservice.dto.AcountDtoRequest;
import org.sid.microservice.dto.AcountDtoResponse;
import org.sid.microservice.entities.BanckAccount;
import org.sid.microservice.mappersAccount.MapperAcount;
import org.sid.microservice.reposetories.BanckAccocuntReposetorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor

public class AcountServicesImpl implements AcountServices {
    @Autowired
    private BanckAccocuntReposetorie banckAccocuntReposetorie;

     private MapperAcount mapperAcount;

    @Override
    public AcountDtoResponse addAccount(AcountDtoRequest acountDtoInput) {
        acountDtoInput.setId(UUID.randomUUID().toString());
        System.out.println(acountDtoInput.toString());

        return mapperAcount.FromeBanckAccountToAccountOutputDTO(banckAccocuntReposetorie.save(mapperAcount.fromAccountInputDTOToAccountEntity(acountDtoInput)));

    }

    @Override
    public void deleteAccount(String id) {
        banckAccocuntReposetorie.deleteById(id);
    }

    @Override
    public AcountDtoResponse updateAccount(AcountDtoRequest acountDtoInput, String id) {
        BanckAccount banckAccount = banckAccocuntReposetorie.findById(id).get();
        if (acountDtoInput.getBalance()!= null) {
            banckAccount.setBalance(acountDtoInput.getBalance());
        }
        if (acountDtoInput.getType() != null) {
            banckAccount.setType(acountDtoInput.getType());
        }
        if (acountDtoInput.getCreateAt() != null) {
            banckAccount.setCreateAt(acountDtoInput.getCreateAt());
        }
        if (acountDtoInput.getDevise() != null) {
            banckAccount.setDevise(acountDtoInput.getDevise());
        }

        banckAccocuntReposetorie.save(banckAccount);
        return mapperAcount.FromeBanckAccountToAccountOutputDTO(banckAccount);
    }

    @Override
    public AcountDtoResponse getAccount(String id) {
        return mapperAcount.FromeBanckAccountToAccountOutputDTO(banckAccocuntReposetorie.findById(id).get());

    }

    @Override
    public List<AcountDtoResponse> getAllAcount() {
        List<BanckAccount> listeAccount = banckAccocuntReposetorie.findAll();
        List<AcountDtoResponse> acountDtoOutputs = listeAccount.stream().map(account -> mapperAcount
                .FromeBanckAccountToAccountOutputDTO(account))
                .collect(Collectors.toList());
        return acountDtoOutputs;
    }
}
