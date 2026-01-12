package com.example.e_com_backend.Repository;

import com.example.e_com_backend.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
