package com.example.e_com_backend.Service;

import com.example.e_com_backend.Entity.Customer;
import com.example.e_com_backend.Repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService  {
    private CustomerRepository customerRepository;

    //Create customer
    public Customer createUser(Customer customer) {
        return customerRepository.save(customer);
    }
    //Get customer
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }


}
