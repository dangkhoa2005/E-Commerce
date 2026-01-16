package com.example.e_com_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegisterRequest {
    private String customerEmail;
    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String postcode;
    private String city;
    private String phone;
}
