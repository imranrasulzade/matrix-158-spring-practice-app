package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.entity.Company;
import com.matrix.matrix158springpracticeapp.repository.CompanyRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;


    @Override
    public Optional<Company> findById(Integer id) {
        return companyRepository.findById(id);
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void deleteById(Integer id) {
        companyRepository.deleteById(id);
    }

}
