package com.github.youssfbr.catalog.services;

import com.github.youssfbr.catalog.entities.Category;
import com.github.youssfbr.catalog.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

}
