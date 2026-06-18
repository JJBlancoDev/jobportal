package com.jjblancodev.jobportal.company.controller;

import com.jjblancodev.jobportal.company.service.ICompanyService;
import com.jjblancodev.jobportal.dto.CompanyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final ICompanyService companyService;

    @RequestMapping(version = "1.0", method = RequestMethod.GET)
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        return ResponseEntity.ok().body(companyService.getAllCompanies());
    }
}
