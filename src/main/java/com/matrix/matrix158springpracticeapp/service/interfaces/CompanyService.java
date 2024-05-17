package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    Optional<Company> findById(Integer id);

    List<Company> findAll();

    Company save(Company company);

    void deleteById(Integer id);
}
