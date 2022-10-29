package com.example.micro1.reposetorie;


import com.example.micro1.entite.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface InvoiceReposetorie extends JpaRepository<Invoice,String> {
}

