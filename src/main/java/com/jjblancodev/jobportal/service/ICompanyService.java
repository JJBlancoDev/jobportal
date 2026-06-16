package com.jjblancodev.jobportal.service;

import com.jjblancodev.jobportal.dto.CompanyDto;
import com.jjblancodev.jobportal.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
}
