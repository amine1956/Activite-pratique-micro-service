package com.example.micro1.reposetorie;

import com.example.micro1.entite.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface CustmerReposetorie extends JpaRepository<Custmer,Long> {
}

