package com.github.youssfbr.catalog.resources;

import com.github.youssfbr.catalog.entities.Category;
import com.github.youssfbr.catalog.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    private final CategoryService service;

    public CategoryResource(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
