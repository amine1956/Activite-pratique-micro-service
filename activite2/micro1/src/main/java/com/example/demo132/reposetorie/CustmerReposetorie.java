package com.example.demo132.reposetorie;


import com.example.demo132.entite.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustmerReposetorie extends JpaRepository<Custmer,Long> {
}

