package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
