package com.example.micro2.reposetorie;

import com.example.micro2.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposetorie extends JpaRepository<Product,Long> {
}

