package com.jjblancodev.jobportal.company.service.impl;

import com.jjblancodev.jobportal.dto.CompanyDto;
import com.jjblancodev.jobportal.dto.JobDto;
import com.jjblancodev.jobportal.entity.Company;
import com.jjblancodev.jobportal.entity.Job;
import com.jjblancodev.jobportal.mappers.company.CompanyMapper;
import com.jjblancodev.jobportal.repository.CompanyRepository;
import com.jjblancodev.jobportal.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyDto> getAllCompanies() {
        List<Company> companyList = companyRepository.findAll();

        if(!companyList.isEmpty()) {
            return companyList.stream().map(CompanyMapper::transformCompanyToDto).toList();
        }

        return List.of();
    }
}