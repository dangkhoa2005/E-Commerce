package com.example.e_com_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "category")
@Builder
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name", nullable = false, length = 100)
    private String categoryName;

    @Column(name = "category_image", length = 255)
    private String categoryImage;

    @Column(name = "category_description", columnDefinition = "TEXT")
    private String categoryDescription;

    public Category(String categoryName, String categoryImage, String categoryDescription) {
    }
}
