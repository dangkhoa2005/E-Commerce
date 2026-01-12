package com.example.e_com_backend.Service;

import com.example.e_com_backend.Entity.Category;
import com.example.e_com_backend.Repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor

public class CategoryService {
    private CategoryRepository categoryRepository;
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
