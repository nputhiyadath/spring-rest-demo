package com.example.spring.spring5mvcrest.repositories;

import com.example.spring.spring5mvcrest.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    Vendor findByName(String name);
}
