package com.example.e_com_backend.Controller;

import com.example.e_com_backend.Entity.Customer;
import com.example.e_com_backend.Service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<Customer> createCustomer (@RequestBody Customer customer) {
         Customer savedCustomer = customerService.createUser(customer);
         return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
}
