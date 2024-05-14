package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
