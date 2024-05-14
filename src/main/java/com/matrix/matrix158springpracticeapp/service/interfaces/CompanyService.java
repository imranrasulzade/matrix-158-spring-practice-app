package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.entity.Company;

import java.util.List;

public interface CompanyService {

    Company findById(Integer id);

    List<Company> findAll();

    Company save(Company company);

    void deleteById(Integer id);
}
