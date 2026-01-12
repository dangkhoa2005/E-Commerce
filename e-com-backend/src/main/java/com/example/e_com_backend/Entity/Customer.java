package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "Customer")
@Setter
@Getter
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Customer_Id;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    private String username;

    private String password;

}


