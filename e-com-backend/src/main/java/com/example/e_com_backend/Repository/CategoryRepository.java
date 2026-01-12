package com.example.e_com_backend.Repository;

import com.example.e_com_backend.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
