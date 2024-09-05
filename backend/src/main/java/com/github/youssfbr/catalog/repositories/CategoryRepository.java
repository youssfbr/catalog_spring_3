package com.github.youssfbr.catalog.repositories;

import com.github.youssfbr.catalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {
}
